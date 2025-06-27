import cv2
import pytesseract

# Ruta a Tesseract
pytesseract.pytesseract.tesseract_cmd = r"C:\Program Files\Tesseract-OCR\tesseract.exe"

def preprocesar(roi):
    gris = cv2.cvtColor(roi, cv2.COLOR_BGR2GRAY)
    gris = cv2.bilateralFilter(gris, 11, 17, 17)
    _, umbral = cv2.threshold(gris, 150, 255, cv2.THRESH_BINARY)
    return umbral

cap = cv2.VideoCapture(0)

while True:
    ret, frame = cap.read()
    if not ret:
        break

    original = frame.copy()
    gris = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    gris = cv2.bilateralFilter(gris, 11, 17, 17)

    # Detectar bordes y contornos
    edges = cv2.Canny(gris, 30, 200)
    contornos, _ = cv2.findContours(edges.copy(), cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

    placa_detectada = False
    for cnt in contornos:
        approx = cv2.approxPolyDP(cnt, 0.018 * cv2.arcLength(cnt, True), True)
        if len(approx) == 4:  # posible rectángulo
            x, y, w, h = cv2.boundingRect(approx)
            aspect_ratio = w / float(h)
            if 2 < aspect_ratio < 6:  # típica proporción de una placa
                roi = frame[y:y+h, x:x+w]
                procesado = preprocesar(roi)

                texto = pytesseract.image_to_string(
                    procesado,
                    config='--psm 7 -c tessedit_char_whitelist=ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789',
                    lang='eng'
                ).strip().replace(" ", "").replace("\n", "")

                if texto:
                    cv2.putText(original, texto, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 0), 2)
                    cv2.rectangle(original, (x, y), (x + w, y + h), (0, 255, 0), 2)
                    print("Placa detectada:", texto)
                    placa_detectada = True
                    break  # Solo una placa por frame

    if not placa_detectada:
        cv2.putText(original, "Buscando placa...", (10, 30), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)

    cv2.imshow("Detección de Placas", original)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()

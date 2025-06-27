import mysql.connector
import smtplib
from email.message import EmailMessage
from datetime import datetime, date
import tkinter as tk
from tkinter import messagebox, simpledialog


def enviar_comparendo(placa_busqueda):
    try:
        conexion = mysql.connector.connect(
            user='root',
            password='admin7942_',
            host='localhost',
            database='sistema_vial',
            port='3306'
        )
        cursor = conexion.cursor()

        consulta = """
        SELECT propietario.correo, vehiculo.id_vehiculo
        FROM propietario
        JOIN vehiculo ON propietario.id_propietario = vehiculo.id_propietario
        WHERE vehiculo.placa = %s
        """
        cursor.execute(consulta, (placa_busqueda,))
        resultados = cursor.fetchall()

        if not resultados:
            messagebox.showerror("Error", f"No se encontró ningún vehículo con la placa {placa_busqueda}")
            return

        correo, id_vehiculo = resultados[0]

        confirmar = messagebox.askyesno("Confirmación", f"¿Desea enviar el comparendo al correo {correo}?")

        if confirmar:
            # Registrar comparendo
            tiempoActual = datetime.now().time()
            fechaActual = date.today()
            tipoComparendo = "Velocidad excesiva"

            sql = """
            INSERT INTO comparendo (hora, tipo_comparendo, fecha, id_vehiculo)
            VALUES (%s, %s, %s, %s)
            """
            valores = (tiempoActual, tipoComparendo, fechaActual, id_vehiculo)
            cursor.execute(sql, valores)
            conexion.commit()

            # Enviar correo
            msg = EmailMessage()
            msg['Subject'] = 'Notificación de Comparendo Vial'
            msg['From'] = 'vialsistema@gmail.com'
            msg['To'] = correo
            msg.set_content(f"""\
Estimado/a ciudadano(a):

Le informamos que ha sido registrado un comparendo en su contra en el sistema vial nacional.

Detalles del comparendo:
- Tipo: {tipoComparendo}
- Fecha: {fechaActual.strftime('%d/%m/%Y')}
- Hora: {tiempoActual.strftime('%H:%M:%S')}
- Vehículo con placa: {placa_busqueda}

Por favor, acceda al portal oficial para más información y para realizar el proceso correspondiente.

Atentamente,  
Sistema Vial Nacional
            """)

            smtp_server = 'smtp.gmail.com'
            smtp_port = 587
            usuario = 'vialsistema@gmail.com'
            contrasena = 'fida tucz pcsd vltp'  # Se recomienda usar variables de entorno

            try:
                with smtplib.SMTP(smtp_server, smtp_port) as servidor:
                    servidor.starttls()
                    servidor.login(usuario, contrasena)
                    servidor.send_message(msg)
                    messagebox.showinfo("Éxito", "Comparendo registrado y correo enviado.")
            except Exception as e:
                messagebox.showerror("Error de envío", f"Error al enviar el correo: {e}")
        else:
            messagebox.showinfo("Cancelado", "No se envió ningún correo.")
    except Exception as err:
        messagebox.showerror("Error de conexión", f"Ocurrió un error: {err}")
    finally:
        if 'cursor' in locals(): cursor.close()
        if 'conexion' in locals(): conexion.close()


# Interfaz gráfica
def iniciar_interfaz():
    root = tk.Tk()
    root.title("Sistema de Comparendos Viales")
    root.geometry("400x300")
    root.resizable(False, False)

    # Etiquetas y campos de entrada
    lbl_titulo = tk.Label(root, text="Sistema de Comparendos", font=("Arial", 18, "bold"), pady=10)
    lbl_titulo.pack()

    lbl_placa = tk.Label(root, text="Placa del vehículo:", font=("Arial", 12))
    lbl_placa.pack(pady=10)

    entrada_placa = tk.Entry(root, font=("Arial", 12), width=20)
    entrada_placa.pack(pady=5)

    # Función al presionar el botón
    def procesar_placa():
        placa = entrada_placa.get().strip().upper()
        if placa:
            enviar_comparendo(placa)
        else:
            messagebox.showerror("Error", "Por favor ingrese una placa válida")

    # Botón para enviar
    btn_enviar = tk.Button(root, text="Enviar Comparendo", font=("Arial", 12), bg="green", fg="white", command=procesar_placa)
    btn_enviar.pack(pady=20)

    # Botón de cierre
    btn_salir = tk.Button(root, text="Salir", font=("Arial", 12), bg="red", fg="white", command=root.quit)
    btn_salir.pack(pady=10)

    # Mostrar la interfaz
    root.mainloop()


if __name__ == "__main__":
    iniciar_interfaz()

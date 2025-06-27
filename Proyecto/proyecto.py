import mysql.connector
import smtplib
from email.message import EmailMessage
from datetime import datetime, date


conexion = mysql.connector.connect(user='root', password='admin7942_', host='localhost', database='sistema_vial', port='3306')
cursor = conexion.cursor()

consulta = """
SELECT propietario.correo, vehiculo.id_vehiculo
FROM propietario
JOIN vehiculo ON propietario.id_propietario = vehiculo.id_propietario
WHERE vehiculo.placa = %s
"""

placa_busqueda = input("Digite la placa: ");

cursor.execute(consulta, (placa_busqueda,))
resultados = cursor.fetchall()

correo, id_vehiculo = resultados[0]

print("Correo", correo)
print("ID_Vehiculo", id_vehiculo)
opc = int(input("Esta seguro que desea enviarle el comparendo 1.Si 2.No: "))

if opc == 1:
    # Datos 
    tiempoActual = datetime.now().time()
    fechaActual = date.today()
    tipoComparendo = "Velocidad excesiva"
    idVehiculo = id_vehiculo

    sql = "INSERT INTO comparendo (hora, tipo_comparendo, fecha, id_vehiculo) VALUES(%s, %s, %s, %s)"
    valores = (tiempoActual, tipoComparendo, fechaActual, idVehiculo)
    cursor.execute(sql, valores)
    conexion.commit()
    print("Comparendo registrado con ID: ", cursor.lastrowid)

    msg = EmailMessage()
    msg['Subject'] = 'COMPARENDO VIAL'
    msg['From'] = 'vialsistema@gmail.com'
    msg['To'] = resultados[0]
    msg.set_content('Usted ha sido registrado en el sistema de comparendos')
    
    smtp_server = 'smtp.gmail.com'
    smtp_port = 587

    usuario = 'vialsistema@gmail.com'
    contrasena = 'fida tucz pcsd vltp'
    try:
        with smtplib.SMTP(smtp_server, smtp_port) as servidor:
            servidor.starttls()
            servidor.login(usuario, contrasena)
            servidor.send_message(msg)
            print("Correo enviado correctamente")
    except Exception as e:
        print("Error al enviar el correo:", e)
elif opc == 2:
    print("Correo no enviado")    


cursor.close()
conexion.close()

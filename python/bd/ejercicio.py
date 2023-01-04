# En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: 
# la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que 
# también será de tipo texto.
# Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la
#  tabla.
# Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.

import sqlite3


def main():
    insertar_alumno(1,"juan","sanchez")
    insertar_alumno(2,"marcos","sanchez1")
    insertar_alumno(3,"juan","sanchez2")
    insertar_alumno(4,"luis","sanchez3")
    insertar_alumno(5,"alan","sanchez4")
    insertar_alumno(6,"pedro","sanchez5")
    insertar_alumno(7,"mateo","sanchez6")
    insertar_alumno(8,"marcos","sanchez7")

    buscar_alumno("juan")


def insertar_alumno(id,nombre,apellido):
    conn = sqlite3.connect('myapplication.db')
    cursor= conn.cursor()
    query=f'INSERT INTO alumnos(id,nombre,apellido) VALUES ({id},"{nombre}","{apellido}")'
    cursor.execute(query)
    cursor.close()
    conn.commit()
    conn.close()

def buscar_alumno(nombre):
    conn = sqlite3.connect('myapplication.db')
    cursor= conn.cursor()
    query=f'SELECT * FROM alumnos WHERE nombre="{nombre}"'
    rows = cursor.execute(query)
    for i in rows:
        print(i)
    cursor.close()
    conn.close()

main()
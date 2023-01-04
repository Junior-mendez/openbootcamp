import sqlite3
import getpass

def main():
    crear_usuario(3,"pepe","pepe")
def main2():
    username = input("Nombre de Usuario: ")
    password = getpass.getpass("Contraseña: ")

    if verifica_credenciales(username,password):
        print("Login Correcto")
    else:
        print("Login Incorrecto")

def crear_usuario(id,username,password):
    conn= sqlite3.connect('myapplication.db')##isolation_level=None
    cursor=conn.cursor()
    query=f'INSERT INTO users(id,username,password) VALUES("{id}","{username}","{password}")'
    rows = cursor.execute(query)
    print(type(rows))
    conn.commit()
    cursor.close()
    conn.close()

def verifica_credenciales(username,password):
    conn=sqlite3.connect('myapplication.db')
    cursor = conn.cursor()
    query = f'SELECT id FROM users WHERE username="{username}" and password="{password}"'
    print(f'query:{query}')
    rows =  cursor.execute(query)
    data =  rows.fetchone()
    cursor.close()
    if data== None:
        return False
    return True

main()
# conn=sqlite3.connect('myapplication.db')

# cursor = conn.cursor()

# rows = cursor.execute('SELECT * FROM users WHERE id=1')
# for row in rows:
#     print(row[1])
# cursor.close()

# conn.close()
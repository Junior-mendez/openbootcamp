#Permisos ficheros
# r= lectura
# a = append
# w = escritura
# x = create

# t= texto
# b = binary

# f = open('C:\Developer\openbootcamp\python\clasesObjetos\Ejercicio1.py','r')
# datos = f.readlines()
# print(datos)
# f.close()

def escribe(fichero,datos):
    f = open(fichero,'w')
    for linea in datos:
        if not linea.endswith('\r'):
            linea +='\n'
        f.write(linea)
    f.close()

lista=[
    "una linea",
    "dos lineas",
    "tres lineas"
]

escribe('filenew.txt',lista)








def escribeArchivo(fichero, dato,acceso):
    f = open(fichero,acceso)
    f.write(dato)
    f.close()

escribeArchivo('archivo.txt',"dato1\n","w")
escribeArchivo('archivo.txt',"dato1\n","a")

class Alumno:
    def __init__(self,nombre,nota) :
        self.nombre=nombre
        self.nota=nota
    
    def imprimir(self):
        print("Alumno: { nombre: ",self.nombre,", nota: ",self.nota," }")

    def obtenerNota(self):
        if(self.nota>=12):
            print(self.nombre," está aprobado")
        else:
            print(self.nombre," está desaprobado")

alumno=Alumno("Junior",20)
alumno.imprimir()
alumno.obtenerNota()

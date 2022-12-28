
hoyHace= 12.0
def mifuncion(nombre):
    #global hoyHace
    hoyHace=6.0
    print("Hola ", nombre," la temperatura es de ", hoyHace)

mifuncion("Junior")
print(hoyHace)


def sum(*args):
    resultado=0
    for arg in args:
        resultado+=arg
    print(resultado)

sum(1,2,3,4,5,5,6,6)




def sum1(**kwargs):
   for key,value in kwargs.items():
    print(key,":",value)

sum1(vivienda="piso",coche="rojo")

def operaciones(a,b):
    return a+b,a-b,a*b,a/b

suma,resta,multi,_=operaciones(2,4)
resultados=operaciones(2,4)
print(suma)
print(resta)
print(multi)
print(resultados)


def sumador(**kwargs):
    inicial= kwargs["inicial"] if "inicial" in kwargs else 0
    final = kwargs["final"] if "final" in kwargs else 0
    resultado=0
    for x in range(inicial,final+1):
        resultado+=x
    return resultado

print(sumador(inicial=5,final=7))

#Funciones anónimas - lambda

anonima = lambda nombre: print("hola ",nombre)
anonima("Junior")
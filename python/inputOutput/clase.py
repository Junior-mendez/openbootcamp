numero=5
texto="quijote"
otromas = 1.2
#forma antigua para mostrar
print("El numero es %d y el texto es %s y tiene %f" % (numero, texto, otromas))
# forma antigua para darle formato a la salida
print("Valor flotante: %.1f" % otromas)

#forma de manejar la salida con format
print("El numero es {} y el texto es {} y tiene {}".format(numero,texto,otromas))
# Se puede indicar el indice que se quiere mostrar
print("El numero es {1} y el texto es {0} y tiene {2}".format(texto,numero,otromas))
# se puede colocar la clave que se quiere mostrar
print("El numero es {n1} y el texto es {txt} y tiene {deci}".format(n1=numero,txt=texto,deci=otromas))

print(f'El numero es {numero} y el texto {texto} y tiene {otromas}')

# str representación para el usuario
# repr representación para debug técnico

class Juguete:
    nombre=""
    precio=0

    def __init__(self,nombre,precio):
        self.nombre=nombre
        self.precio=precio

    def __str__(self) -> str:
        return f'Mi nombre es {self.nombre} y mi precio es {self.precio}'
    
    def __repr__(self) -> str:
        return f'Potato({self.nombre},{self.precio})'
    
j1 = Juguete("Potato",10.0)
print(j1)
print(repr(j1))

# Métodos str

cadena = "en un lugar de la ManchA"
numero="5"
cadenaEspacios = "       en un lugar de la ManchA          "
print(cadena.capitalize())
print(cadena.title())
print(cadena.lower().count("a"))
print(cadena.count("a"))
print(numero.isdigit())
print(cadenaEspacios.strip())
print(cadenaEspacios.lstrip())
print(cadenaEspacios.rstrip())
print(cadena.split())
print(cadena.startswith("en"))
print(cadena.endswith("ManchA"))



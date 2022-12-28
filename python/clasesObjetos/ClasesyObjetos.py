# Objeto: Representación en programación del mundo real
# Métodos: Acciones que realiza el objeto.
# Propiedades - Atributos: Características con las que cuenta el objeto.
# Clase: es una plantilla o definicion para generar objetos a partir de ella.

## Si una propiedad inicia con "_" es recomendable no tocar la propiedad desde fuera. Es una convención.
# class Dino:
#     _encendido= True
    

#     def enciende(self):
#         self._encendido=True
#     def apaga(self):
#         self._encendido=False
#     def isEncendido(self):
#         return self._encendido
       

# d= Dino()
# d.enciende()
# d.apaga()
# print(d.isEncendido())


# class Estatica:
#     numero=1

#     def incrementa():
#         Estatica.numero+=1

# Estatica.incrementa()
# print(Estatica.numero)
# Estatica.incrementa()
# print(Estatica.numero)
# Estatica.incrementa()
# print(Estatica.numero)


##Herencia

class Juguete:
    _encendido= True
    

    def enciende(self):
        self._encendido=True
    def apaga(self):
        self._encendido=False
    def isEncendido(self):
        return self._encendido

class Potato(Juguete):

    def quitarOreja(self):
        pass

    def ponerOreja(self):
        pass

class Dino(Juguete):
    def __init__(self,nombre):
       print("Estoy en el constructor", self.__class__)
    def verEscamas(self):
        pass
d= Dino("Junior")
# print(dir(d))


#clase Abstracta

from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def sonido(self):
        pass

    def diHola(self):
        print("Hola")

class Perro(Animal):
    def sonido(self):
        print("Guau")

class Gato(Animal):
    def sonido(self):
        print("Miau")
p =Perro()
p.sonido()
p.diHola()
g =Gato()
g.sonido()
g.diHola()



class Motor:
    tipo="Diesel"
class Ruedas:
    cantidad=4
class Ventanas:
    cantidad=5
class Carroceria:
    ventanas= Ventanas()
    ruedas = Ruedas()
class Coche:
    motor = Motor()
    carroceria = Carroceria()

c = Coche()
print(c.motor.tipo)
print(c.carroceria.ventanas.cantidad)

class Categoria:
    pass
class Proveedor:
    pass

class Producto:
    idproducto=0
    categoriaProducto=Categoria()
    precio=0
    tamaño=0
    tipoDeProducto=0
    cifProveedor=Proveedor()
# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

# Color

# Ruedas

# Puertas

# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

# Velocidad

# Cilindrada

# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehiculo:
    color="Blanco"
    ruedas=4
    puertas=5

class Coche(Vehiculo):
    velocidad=100
    cilindrada=2000

coche = Coche()
print("Coche color: ",coche.color)
print("Coche ruedas: ",coche.ruedas)
print("Coche puertas: ",coche.puertas)
print("Coche velocidad: ",coche.velocidad)
print("Coche cilindrada: ",coche.cilindrada)

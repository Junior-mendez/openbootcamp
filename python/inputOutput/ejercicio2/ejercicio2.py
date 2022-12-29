import pickle

class Vehiculo:
    marca=""
    color=""

    def __init__(self,marca,color) -> None:
        self.marca=marca
        self.color=color
    def __str__(self) -> str:
        return f"Auto {self.marca} de color {self.color}"
    
auto = Vehiculo("toyota","blanco")
f = open('vehiculos.bin','wb')
pickle.dump(auto,f)
f.close()
f = open('vehiculos.bin','rb')
auto_recuperado = pickle.load(f)
print(auto_recuperado)
f.close()

    
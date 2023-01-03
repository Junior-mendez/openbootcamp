# Crea un script que le pida al usuario una lista de países (separados por comas). 
# Éstos se deben almacenar en una lista. No debería haber países repetidos (haz uso de set). 
# Finalmente, muestra por consola la lista de países ordenados alfabéticamente y separados por comas.

paises= input("Ingresa el nombre de paises separado por comas: ")
listPaises =paises.split(",")
listPaises = set(listPaises)
print(sorted(listPaises))

# > Mañyor
# < Menor
# == Igual
# <= Menor o igual
# >= Mayor o igual 
a=4
b=6
c=7
resultado=(a>=5 and c <=7)
print(resultado)

# if a>6 and b<=6:
#     print("estoy en el if")
# elif a>=6:
#     print("A es mayor o igual que 6")
# else:
#     print("no se cumple nada")

contador=1

# while contador<=10:
#     print("contador",contador)
#     if contador == 5:
#         print("hola")
#         continue
#     contador+=1

# lista = [1,2,3,4,5]
# # for value in lista:
# #     print(value)
# for numero in range(11):
#     print(numero)
valor=3
match valor:
    case 1:
        print("Valor es 1")
    case 2:
        print("Valor es 2")
    case 3:
        print("Valor es 3")
    case 4:
        print("Valor es 4")


# pass sirve para que la sintaxis sea correcta y no nos mande error en un ambito condicional o de bucle

if 5 <6:
    pass
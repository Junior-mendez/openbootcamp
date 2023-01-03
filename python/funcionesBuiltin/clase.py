# import _thread
# import time
# def horaActual(name_thread, tiempo_espera):
#     count=0
#     while count<5:
#         time.sleep(tiempo_espera)
#         print(f'hilo:{name_thread}-{time.ctime(time.time())}')
#         count+=1

# _thread.start_new_thread(horaActual,("thread_uno",1))
# _thread.start_new_thread(horaActual,("thread_dos",2))

# while True:
#     pass


# import logging
# logging.basicConfig(level=logging.DEBUG)
# logging.debug("Arrancando programa")
# logging.info("Arrancando programa")
# logging.warning("Alerta")
# logging.error("Error")
# logging.critical("Critico")

# numeros = [1,2,3,4,5,6,7,8,9,10]

# def mifuncion(x):
#     if x%2==0:
#         return True
#     return False
###Filter
# #resultado=filter(mifuncion,numeros)
# #resultado=filter(lambda x : x%2==0,numeros)
# resultado=filter(lambda x : x.startswith("p"),["pepe","pepito","juan"])
# print(list(resultado))
###Map
# def cuadrado(x):
#     return x*x
# resultado = map(cuadrado, [1,2,3,4,5,6,7,8,9])
# #resultado = map(lambda x: x*x, [1,2,3,4,5,6,7,8,9])
# print(list(resultado))

###Reduce
# from functools import reduce

# def suma(a,b):
#     return a+b

# res = reduce(suma,[1,2,3,4,5])
# #res = reduce(lambda a,b: a+b,[1,2,3,4,5])
# print(res)

# ####Zip
# cursos=['Java', 'Python', 'Git']
# asistentes=[15,20,4]
# demo = zip(cursos,asistentes)
# print(list(demo))

#### all() and any()
#listaA=[1==1,2==2,3==4]
#res = any(listaA) --True
#res = all(listaA) --False
#print(res)


####Round

# a=5.5
# b=5.4
# c=5.6

# print(round(a))
# print(round(b))
# print(round(c))

##### Min
# print(min(1,2,3,4,5,6))

### Pow 
# print(pow(2,4))

####Sorted
# lista = ['z','c','d','a']
# ordenada =  sorted(lista,reverse=True,key= lambda x: x.endswith('z'))
# print(ordenada)

from getpass import  getpass
user = input("usuario: ")
passwd = getpass("password: ")
print(user,passwd)
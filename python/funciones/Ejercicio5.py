def bisiesto(anio):
    if (anio%4==0  and anio%100==0 and anio%400==0):
        print("Es año es bisiesto")
    elif(anio%4==0 and anio%100!=0 and anio%400!=0):
        print("Es año es bisiesto")
    else:
         print("Es año no es bisiesto")
bisiesto(2019)
bisiesto(1981)
bisiesto(2020)
bisiesto(2012)
bisiesto(1900)
bisiesto(2100)
bisiesto(2000)
bisiesto(2400)
import time

hora= time.strftime('%H')
minutos= time.strftime('%M')

if int(hora)>=19:
    print("es hora de ir a casa")
else:
    print("Quedan {} horas y {} minutos para ir a casa".format(18-int(hora),60-int(minutos)))
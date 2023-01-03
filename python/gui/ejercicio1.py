import tkinter
from tkinter import ttk
window = tkinter.Tk()
seleccion = tkinter.StringVar()
def seleccionar(event):
    seleccion.set(None)
    print("reiniciar")
radiobut = ttk.Radiobutton(window,text="Masculino",value='1',variable=seleccion)
radiobut1 = ttk.Radiobutton(window,text="Femenino",value='2',variable=seleccion)
radiobut2 = ttk.Radiobutton(window,text="Otro",value='3',variable=seleccion)
boton = ttk.Button(window,text="Reiniciar")
boton.grid(column=0,row=3)
boton.bind('<Button-1>',seleccionar)
radiobut.grid(column=0,row=0)
radiobut1.grid(column=0,row=1)
radiobut2.grid(column=0,row=2)
window.mainloop()
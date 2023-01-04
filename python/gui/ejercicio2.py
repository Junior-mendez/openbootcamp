# En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe de contener una lista 
# de elementos seleccionables, también debe de tener un label con el texto que queráis.

import tkinter
from tkinter import ttk

window =  tkinter.Tk()

label_colores = tkinter.Label(window,text="Colores")
label_colores.grid(column=0,row=0)
lista = ['blanco','amarillo','negro','rojo']
lista_items = tkinter.StringVar(value=lista)
listbox= tkinter.Listbox(window,height=20,listvariable=lista_items)
listbox.grid(column=0,row=1,sticky=tkinter.W)
window.mainloop()
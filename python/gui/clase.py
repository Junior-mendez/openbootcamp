##pyGTK
##pyqt5
##wxPython
##Más usada es Tkinter
##Lenguaje TCL/TK
import random
import tkinter
import pprint
from tkinter import ttk

window = tkinter.Tk()
# ## Mediante Pack
# label_saludo = tkinter.Label(window,text="Hola amorcitoo ❤️",bg="red",fg="white",font=500)
# label_saludo.pack(ipadx=50,ipady=50,fill='x',expand=True)
# label_saludo = tkinter.Label(window,text="Te amo ❤️",bg="green",fg="red",font=500)
# label_saludo.pack(ipadx=50,ipady=100,expand=True)  


##Mediante Grid

# window.columnconfigure(0, weight=1)
# window.columnconfigure(1, weight=3)
# ####La rosa de los vientos
# username_label = ttk.Label(window,text="Username:")
# username_label.grid(column=0,row=0,sticky=tkinter.W,padx=5,pady=5)
# username_entry = ttk.Entry(window)
# username_entry.grid(column=1, row=0, sticky=tkinter.E,padx=5,pady=5)
# password_label = ttk.Label(window,text="Password:")
# password_label.grid(column=0,row=1,sticky=tkinter.W,padx=5,pady=5)
# password_entry = ttk.Entry(window,show="*")
# password_entry.grid(column=1, row=1, sticky=tkinter.E,padx=5,pady=5)

# boton_login = ttk.Button(window,text="Login")
# boton_login.grid(column=1,row=3,sticky=tkinter.E,padx=5,pady=3)

# lista = ['window','maOS','linux','Ms DOS']
# lista_items= tkinter.StringVar(value=lista)
# listbox = tkinter.Listbox(window, height=20,listvariable=lista_items)
# listbox.grid(column=0,row=0,sticky=tkinter.W)
####Radio Buttom
# seleccionado = tkinter.StringVar()

# r1=ttk.Radiobutton(window,text='Si',value='1',variable=seleccionado)
# r2=ttk.Radiobutton(window,text='No',value='2',variable=seleccionado)
# r3=ttk.Radiobutton(window,text='Quizas',value='3',variable=seleccionado)
# r1.grid(column=0,row=0,padx=5,pady=5)
# r2.grid(column=0,row=1,padx=5,pady=5)
# r3.grid(column=0,row=2,padx=5,pady=5)

##Check Box

# def seleccionar():
#     print('seleccionado')
# seleccionado = tkinter.StringVar()
# checkbox = ttk.Checkbutton(window,text="Acepto las condiciones",variable=seleccionado,command=seleccionar)
# checkbox.grid(column=0,row=0)

# def saludar(event):
#     print("Han hecho click en saludar")
# def saludarDobleclick(event):
#     print("Han hecho doble click en saludar")
# def salir(event):
#     print("Salir")
#     window.quit()
# boton = tkinter.Button(window,text='Haz click')
# boton_salir = tkinter.Button(window,text='Salir')
# boton.pack()
# boton.bind('<Button-1>',saludar)
# boton.bind('<Double-1>',saludarDobleclick)
# boton_salir.pack()
# boton_salir.bind('<Button-1>',salir)

from tkinter import filedialog
from tkinter import colorchooser
filename = filedialog.askopenfilename()
colorchooser.askcolor()

##Mediante Place

# colors=['blue','red','yellow','purple','green','black']

# for x in range(0,10):
#     color= random.randint(0,len(colors)-1)
#     color2= random.randint(0,len(colors)-1)
#     label = tkinter.Label(window,text='etiqueta!',bg=colors[color],fg=colors[color2])
#     label.place(x= random.randint(0,100), y=random.randint(0,100))


# # label= tkinter.Label(window,text="Posicionamiento absoluto", bg='blue',fg='white')
# label.place(x=10,y=50)




window.mainloop()
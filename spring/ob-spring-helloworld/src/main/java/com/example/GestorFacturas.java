package com.example;

public class GestorFacturas {

    private Calculadora calculator;
    private String nombre;

    public GestorFacturas(Calculadora calculator, String nombre){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculator=calculator;
        this.nombre=nombre;
    }

    public Calculadora getCalculator() {
        return calculator;
    }
}

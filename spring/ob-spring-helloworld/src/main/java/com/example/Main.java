package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Recibir un objeto de spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        System.out.println(calculadora.holaMundo());

        //Creando un objeto de forma normal
       // Calculadora calculator2 = new Calculadora();

        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.getCalculator().holaMundo());
    }
}

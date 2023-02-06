package com.example.obrestdatajpa.service;
import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    public void calculateTest(){
        //Configuración de la prueba
        BookPriceCalculator calculator = new BookPriceCalculator();
        Book book = new Book(1L,"El señor de los anillos","Author",1000,49.99, LocalDate.now(),true);
        //Ejecución de la prueba
        Double price = calculator.calculate(book);

        //Comprobaciones Aserciones
        assertEquals(52.980000000000004,price);
    }

}
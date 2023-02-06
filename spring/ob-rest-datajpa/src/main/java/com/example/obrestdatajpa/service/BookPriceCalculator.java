package com.example.obrestdatajpa.service;

import com.example.obrestdatajpa.entities.Book;

public class BookPriceCalculator {

    public Double calculate(Book book){
        double price = book.getPrice();
        if(book.getPages()>1000){
            price +=5;
        }
        /*
        Precio de envío
         */
        price+=2.99;
        return price;
    }
}

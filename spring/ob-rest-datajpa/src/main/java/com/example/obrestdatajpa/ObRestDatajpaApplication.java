package com.example.obrestdatajpa;
import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		//CRUD
		//crear libro
		bookRepository.save(new Book(null,"Homo Deus","Yuval Noah",450,29.99, LocalDate.of(2018,12,1),true));
		bookRepository.save(new Book(null,"Homo Sapiens","Yuval Noah",450,19.99, LocalDate.of(2013,12,1),true));
		//Mostrar los libros
		 bookRepository.findAll().forEach(
				 System.out::println
		 );
		 //Borrar un libro
		//bookRepository.deleteById(1L);
		//Mostrar libros despues de borrar
		bookRepository.findAll().forEach(
				System.out::println
		);
	}

}

package com.example.obspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.NoSuchElementException;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {

	ApplicationContext context =	SpringApplication.run(ObSpringdatajpaApplication.class, args);
	CocheRepository repository = context.getBean(CocheRepository.class);
		System.out.println("find");
		System.out.println(repository.count());

		//crear y almacenar un coche
		Coche toyota =  new Coche(null,"Toyota","Prius",2010);
		Coche toyotaSave = repository.save(toyota);
		System.out.println(toyotaSave);
		//recuperar un coche por id
		Coche cocheToyota=repository.findById(2L).orElseThrow(NoSuchElementException::new);
		System.out.println(cocheToyota);
	}
}

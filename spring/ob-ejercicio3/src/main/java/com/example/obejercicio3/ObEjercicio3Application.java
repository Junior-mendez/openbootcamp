package com.example.obejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObEjercicio3Application.class, args);
	 	PersonRepository personRepository = context.getBean(PersonRepository.class);
		 Person person =personRepository.save(new Person("Junior","Mendez"));
		System.out.println(person);

	}

}

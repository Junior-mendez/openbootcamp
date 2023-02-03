package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    //Atributo
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }



    //CRUD sobre la entidad book

    //Buscar todos los libros
    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    //Recuperar un solo libro de base de datos segun su id
    @GetMapping("findById/{id}")
    public ResponseEntity<Book> findById(@PathVariable(name = "id") Long id){
        return bookRepository.findById(id).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }


    //crear un nuevo libro en base de datos
    @PostMapping("/create")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return ResponseEntity.ok(bookRepository.save(book));
    }


    //actualizar un libro existente en base de datos

    //borrar un libro de base de datos

}

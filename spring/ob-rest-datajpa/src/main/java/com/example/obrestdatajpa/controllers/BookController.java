package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.hibernate.annotations.NotFound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    //Atributo
    private BookRepository bookRepository;

    private final Logger log = LoggerFactory.getLogger(BookController.class);

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
    @ApiOperation("Buscar un libro por clave primaria id Long")
    public ResponseEntity<Book> findById(@ApiParam("Clave primaria tipo Long") @PathVariable(name = "id") Long id){
        return bookRepository.findById(id).map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }


    //crear un nuevo libro en base de datos
    @PostMapping("/create")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        log.info(headers.get("User-Agent").toString());
        if(book.getId()!=null){
            log.warn("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(bookRepository.save(book));
    }


    //actualizar un libro existente en base de datos
   @PutMapping("/update")
    public ResponseEntity<Book> update(@RequestBody Book book){
        if (book.getId()==null){
            log.warn("Trying to update a non existent book");
            return ResponseEntity.badRequest().build();
        }
        if(!bookRepository.existsById(book.getId())){
            log.warn("Trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bookRepository.save(book));
   }

    //borrar un libro de base de datos

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> detele(@PathVariable Long id){
        if(!bookRepository.existsById(id)){
            log.warn("Trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }
        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

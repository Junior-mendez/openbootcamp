package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:"+port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }
    @DisplayName("Comprobar Hello desde Controlador")
    @Test
    void hello() {
       ResponseEntity<String> response = testRestTemplate.getForEntity("/hello",String.class);
       assertTrue(response.getStatusCode().is2xxSuccessful());
        assertTrue(response.getBody().contentEquals("Hola Mundo que tal chicos!!!"));
    }

    @Test
    void findAll() {
       ResponseEntity<Book[]> response =  testRestTemplate.getForEntity("/book/findAll", Book[].class );
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertEquals(200,response.getStatusCodeValue());
        List<Book> bookList =  Arrays.asList(response.getBody());
        System.out.println(bookList.size());
    }

    @Test
    void findById() {
        ResponseEntity<Book> response =  testRestTemplate.getForEntity("/book/findAll/1", Book.class );
        assertTrue(response.getStatusCode().is4xxClientError());
        assertEquals(HttpStatus.NOT_FOUND,response.getStatusCodeValue());
    }

    @Test
    void create() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String json="{\n" +
                "    \"title\": \"Libro desde Spring Test\",\n" +
                "    \"author\": 4234,\n" +
                "    \"pages\": 450,\n" +
                "    \"price\": 19.99,\n" +
                "    \"releaseDate\": \"2013-12-01\",\n" +
                "    \"online\": true\n" +
                "}";
        HttpEntity<String> request = new HttpEntity<>(json,headers);

       // ResponseEntity<Book> response = testRestTemplate.postForEntity("/book/create", request, Book.class);

        ResponseEntity<Book> response = testRestTemplate.exchange("/book/create",HttpMethod.POST, request, Book.class);

        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertEquals(1L, response.getBody().getId());
    }
}
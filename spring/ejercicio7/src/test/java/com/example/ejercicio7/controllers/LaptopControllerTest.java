package com.example.ejercicio7.controllers;

import com.example.ejercicio7.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
    restTemplateBuilder=restTemplateBuilder.rootUri("http://localhost:"+port+"/api");
    testRestTemplate =  new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void findAll() {
        ResponseEntity<Laptop[]> response = testRestTemplate.getForEntity("/findAll", Laptop[].class );
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertTrue(response.getStatusCode().is2xxSuccessful());
    }

    @Test
    void findOneById() {
        ResponseEntity<Laptop> response = testRestTemplate.getForEntity("/findOneById",Laptop.class);
        assertTrue(response.getStatusCode().is4xxClientError());
        assertTrue(response.getStatusCodeValue()==404);
    }

    @Test
    void create() {
        HttpHeaders  headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String json = "{\n" +
                "    \"marca\":\"asus\",\n" +
                "    \"modelo\":\"ZenBook\",\n" +
                "    \"year\":\"2020\",\n" +
                "    \"precio\":6000\n" +
                "}";
        HttpEntity<String> request =new HttpEntity<>(json,headers);
        ResponseEntity<Laptop> response = testRestTemplate.postForEntity("/create",request,Laptop.class);
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertTrue(response.getBody().getMarca().equals("asus"));
    }

    @Test
    void update() {
        HttpHeaders  headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String json = "{\n" +
                "        \"id\": 2,\n" +
                "        \"marca\": \"asus Update\",\n" +
                "        \"modelo\": \"ZenBook\",\n" +
                "        \"year\": 2020,\n" +
                "        \"precio\": 6000.0\n" +
                "    }";
        HttpEntity<String> request =new HttpEntity<>(json,headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/update",HttpMethod.PUT,request,Laptop.class);
        assertTrue(response.getStatusCodeValue()==404);

    }

    @Test
    void delete() {
        HttpHeaders  headers = new HttpHeaders();
        HttpEntity<String> request =new HttpEntity<>("",headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/delete/2",HttpMethod.DELETE,request,Laptop.class);
        assertTrue(response.getStatusCodeValue()==404);
    }

    @Test
    void deleteAll() {
        HttpHeaders  headers = new HttpHeaders();
        HttpEntity<String> request =new HttpEntity<>("",headers);
        ResponseEntity<String> response = testRestTemplate.exchange("/deletaAll",HttpMethod.DELETE,request,String.class);
        assertTrue(response.getStatusCodeValue()==404);
    }
}
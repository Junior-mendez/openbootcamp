package com.example.obrestdatajpa;

import com.example.obrestdatajpa.controllers.BookController;
import com.example.obrestdatajpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BookController.class)
public class BookControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private BookRepository bookRepository;

    @Test
    public void getCandidateTypesSubPackage() throws Exception {
        mockMvc
                .perform(
                        get("/book/prueba"))
                .andDo(print())
                .andExpect(jsonPath("$[*].product",containsInAnyOrder("Product 1","Product 2","Product 5")));
    }
}

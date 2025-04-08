package com.example.SpringBoot3FristApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.leandro.entity.Book;
import com.leandro.service.BookService;

import jakarta.transaction.Transactional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class BookRepositoryTest {

    @Autowired
    private BookService bookService;
    
    @Test
    public void GivenCreateBookThenExpectSameBook() {
	Book book = new Book("Teste","Teste", null);
		
	Book actual = bookService.createBook(book);
	
	
	assertEquals(book.getName(),actual.getName());
	assertEquals(book.getDescription(),actual.getDescription());
	assertEquals(book.getPrice(),actual.getPrice());
    }

}

package com.example.SpringBoot3FristApplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.leandro.entity.Book;
import com.leandro.repository.BookRepository;
import com.leandro.service.BookService;

import jakarta.transaction.Transactional;


@SpringBootTest
@Transactional
@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    @Autowired
    private BookService bookService;
    
    @MockBean
    private BookRepository bookRepository;
    
    @Test
    public void addBookExpectCreated() {
	Book book = new Book("Book 1","Description Book 1",10.99);
		
	bookService.createBook(book);
	
	Mockito.verify(bookRepository, Mockito.times(1)).save(book);
	
    }

}

package com.leandro.service;

import java.util.List;
import java.util.Optional;

import com.leandro.entity.Book;

public interface BookService {
    
    List<Book> findAllBooks();
    
    Book createBook(Book book);
        
    void updateBook(Book book);
    
    void deleteBook(Long id);
    
    Optional<Book> findBookById(Long id);	
    

}

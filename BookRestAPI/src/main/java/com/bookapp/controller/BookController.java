package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
@RequestMapping("/book-api")
public class BookController {
	
	@Autowired 
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> showAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books-by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		return bookService.getByAutor(author);
	}
	
	@GetMapping("/books-by-category/{category}")
	public List<Book> showBooksBycategory(@PathVariable("category")String category){
		return bookService.getByCategory(category);
	}
	
	@GetMapping("/book-by-id/{bookId}")
    public Book showById(@PathVariable("bookId")int id) {
        return bookService.getById(id);
	
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	public String handleException(Exception e) {
		return "error" +e.getMessage();
	}
}

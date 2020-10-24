package com.bookapp.dao;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookDAO {
	List<Book> getAllBooks();
	List<Book> getByAutor(String author) throws BookNotFoundException;
	Book getById(int id)throws BookNotFoundException ;
	List<Book> getByCategory(String category) throws BookNotFoundException;
}

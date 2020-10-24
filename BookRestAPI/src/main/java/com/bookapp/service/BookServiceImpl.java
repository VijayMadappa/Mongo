package com.bookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDaoImpl;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService{
	
	BookDAO bookDAO =new BookDaoImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getByAutor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getByAutor(author);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO.getByCategory(category);
	}

	
}

package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookDaoImpl implements BookDAO{

	@Override
	public List<Book> getAllBooks() {
		return showBookList();
	}

	@Override
	public List<Book> getByAutor(String author)throws BookNotFoundException{
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for (Book book:showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		if(newBookList.isEmpty()) {
			throw new BookNotFoundException("Author not Available");
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) throws BookNotFoundException{
		return showBookList()
				.stream()
				.filter((book)->book.getBookId()==id)
				.findAny()
				.orElseThrow(()->new BookNotFoundException("Id not found"));
		
	}

	@Override
	public List<Book> getByCategory(String category)throws BookNotFoundException{
		// TODO Auto-generated method stub
		List<Book> newBookList=showBookList()
		.stream()
		.filter((book)->book.getCategory().equals(category))
		.collect(Collectors.toList());
		if(newBookList.isEmpty()) {
			throw new BookNotFoundException("category not available");
		
		}
		return newBookList;
		
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"learn java","kathy","tech",900.0),
				new Book(2,"learn c++","kathy","tech",900.0),
				new Book(3,"wise otherwise","sudhamurthy","selfguide",900.0),
				new Book(4,"learn python","dussen","tech",900.0));
				}
	
}

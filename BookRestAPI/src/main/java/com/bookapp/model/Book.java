package com.bookapp.model;

public class Book {

		Integer bookId;
		String title;
		String author;
		String category;
		Double price;
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(Integer bookId, String title, String author, String cateory, Double price) {
			super();
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.category = cateory;
			this.price = price;
		}
		public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategory() {
			return category;
		}
		public void setCateory(String category) {
			this.category = category;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", cateory=" + category
					+ ", price=" + price + "]";
		}
		
		
		
		
	
	
	

}

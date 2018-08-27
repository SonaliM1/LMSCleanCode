package com.library.model;

public class Book {
	private int bookId;
	private String bookTitle;
	private String catagory;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	
	public Book(int bookId, String bookTitle, String catagory) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", catagory=" + catagory + "]";
	}
}

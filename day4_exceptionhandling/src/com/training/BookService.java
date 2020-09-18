package com.training;
import java.util.*;

public class BookService {
	
	private Book[] books = new Book[5];
	private int numberOfBooks = 0;
	
	public void add(Book book){
		
		books[numberOfBooks++] = book;
	}
	
	public Book getOne(int bookId) {
		
		try {
			for(int i=0;i<=numberOfBooks;i++) {
				if(books[i].getBookId()==bookId) {
					return books[i];
				}
			}
		}catch (NoSuchElementException e) {
		
		System.err.println("Cannot find this book with bookId :"+bookId);
		e.printStackTrace();
		}
		return null;
	}
		
	 public Book[] getAll() {
		 return books;	
		
	}
		

}

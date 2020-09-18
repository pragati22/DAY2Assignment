package com.training;

import com.training.exceptions.RangeCheckException;
import com.training.exceptions.MyCustomException;

public class BookStore {
 
	public static void main(String[] args) {
		
	
	BookService service = new BookService();
	
	Book hindiBook = new Book();
	
	try{
	hindiBook = new Book(1,"HINDI BOOK","MC GRAW",500.00);
	
	}catch(RangeCheckException ex) {
		System.err.println(ex.getMessage());
		ex.printStackTrace();
	}
	
	Book frenchBook = new Book();
	frenchBook.setBookId(2);
	
	try {
		frenchBook.setBookName(null);
	}catch(MyCustomException e) {
		System.err.println(e.getMessage());
		e.printStackTrace();
	}
	frenchBook.setAuthor("SHAWN");
	
	try {
		frenchBook.setPrice(600);
	}catch(RangeCheckException exc) {
		System.err.println(exc.getMessage());
		exc.printStackTrace();
	}
	
	service.add(hindiBook);
	service.add(frenchBook);
	
	System.out.println(service.getOne(1));
	System.out.println(service.getOne(2));
	
	Book[] books = service.getAll();
	for(int i=0;i<2;i++) {
		System.out.println(books[i]);
	}
	
 }
	
}



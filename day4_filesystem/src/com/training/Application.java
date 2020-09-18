package com.training;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Customer sia=new Customer("120","sia",95555989,"sia@gmail.com");
		FilesExample service = new FilesExample();
		service.writeToFile(new File("Customer.txt"), sia);
		System.out.println("DONE");
		
		service.readFile(new File("Customer.txt"));
	}

}

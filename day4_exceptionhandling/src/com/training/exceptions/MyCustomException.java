package com.training.exceptions;

public class MyCustomException extends Exception {
	 
	private String message;
	private Throwable cause;

	public MyCustomException(String message,Throwable cause) {
		super();
		this.message = message;
		this.cause = cause;
	}

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "EXCEPTION :"+ message + "--" +cause;
	}

	
}

package com.iface;

public interface Product {
	
	String APPNAME="RENT SYSTEM";  //its public static final by default
	
	//All the 3 methods are public & abstract by default
	
	int productId();
	String modelName();
	double getPrice();

}

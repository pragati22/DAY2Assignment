package com.training;

import com.iface.*;


public class Rent implements CalculateRent {

public Product getProduct(int key) {
		
		switch(key) {
		case 1:
			return new Computer();
			
		case 2:
			return new Furniture();
			
			default:
				return null;
		}
}
		
		public double printEstimate(Product product,int days) {
			
			double rent=+product.getPrice()*days;
			System.out.println(Product.APPNAME);
			System.out.println("PRODUCT ID :"+product.productId());
			System.out.println("ITEM : "+product.modelName());
			System.out.println("TOTAL RENT :"+rent);
			return rent;
			
		}
	
}

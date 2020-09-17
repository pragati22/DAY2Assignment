package com.training;

import com.iface.Product;

public class Furniture implements Product {

	@Override
	public int productId() {
		// TODO Auto-generated method stub
		return 102;
	}

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return "Furlenco";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 15000;
	}

}

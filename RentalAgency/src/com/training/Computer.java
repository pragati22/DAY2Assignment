package com.training;

import com.iface.Product;

public class Computer implements Product {

	@Override
	public int productId() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return "DELL";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 45000;
	}

}

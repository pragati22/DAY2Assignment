package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Customer ram = new Customer();
			
			ram.setCustomerId("one");
			ram.setEmail("ram@gmail.com");
			ram.setCustomerName("Ram");
			
			
			CustomerService service = new CustomerService();
			service.printCustomer(ram);
			
			Customer raj = new Customer();
			
			raj.setCustomerId("102");
			raj.setEmail("rajgmail.com");
			raj.setCustomerName("Raj");
			
			CustomerService service2 = new CustomerService();
			service.generateUserId(raj);
			System.out.println(service2.generateUserId(raj));
			System.out.println("ENCRYPTED"+service.encryptEmail(ram));
			
			
			try {	
				ram.setMobileNumber(-11111000);
				raj.setMobileNumber(-11111222);
			
		} catch (RangeCheckException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
			catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

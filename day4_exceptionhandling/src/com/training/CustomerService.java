package com.training;

public class CustomerService {
	
	String encrypted;
	public String generateUserId(Customer cust) {
		
		
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("ENTER CORRECT CUSTOMER ID IN NUMBERs");
			e.printStackTrace();
		}
		return "";
		
	}

	public void printCustomer(Customer cust) {
		
		try {
			System.out.println(cust.getCustomerName().length());
		} 
		catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("EXCEPTION ==> PLEASE ENTER NAME ");
			e.printStackTrace();
		}
		System.out.println("OUTSIDE TRY CATCH");
		
	}

	public String encryptEmail(Customer cust) {
		String email = cust.getEmail();
		boolean status=email.contains("@");
		
		if(!status) {
			try {
				throw new Exception("Invalid EMAIL");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
			}
			finally {
				System.err.println("INSIDE FINALLY");
			}
			System.out.println("OUTSIDE");
		}
		else {
			encrypted = "abcde"+email+"!4342@";
		}
		
		return encrypted;
	}
}

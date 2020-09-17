package com.training;

import java.util.Scanner;
import com.iface.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double totalRent=0.0;
		
		
		Rent product = new Rent();
		
        String proceed = "YES";
		do {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.COMPUTER");
			System.out.println("2.FURNITURE");
			
			int key=sc.nextInt();
			System.out.println(key);
			
			Product select = product.getProduct(key);
		
			if(select!=null){
				System.out.println("NUMBER OF DAYS YOU WANT TO RENT");
				int days = sc.nextInt();
				double rent=product.printEstimate(select,days);
				totalRent+=rent;
				
			}
			else {
				System.out.println("ENTER VALUE BETWEEN 1-2");
			}
			
			System.out.println("DO YOU WANT TO CONTINUE? ");
			System.out.println("YES/NO");
			
			proceed=sc.next();
			
			
			
		}while(proceed.equalsIgnoreCase("YES"));
		
		System.out.println("ALL ITEM TOTAL:"+totalRent);
		System.out.println("THANK YOU ");
		sc.close();
		
		}
}

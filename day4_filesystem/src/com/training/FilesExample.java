package com.training;
import java.io.*;

public class FilesExample {

	public void writeToFile(File file,Customer cust) throws IOException {
		
		PrintWriter writer=null;
		try {
			 writer=new PrintWriter(new FileWriter(file,true));
			 writer.println(cust.toString());
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
	
public void readFile(File file) throws IOException {
		
	BufferedReader reader = null;
		try {
			reader= new BufferedReader(new FileReader(file));
			
			String line=reader.readLine();
			while(line!=null) {
				
				System.out.println(line);
			}
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			reader.close();
		}
	
		
	}
	
	
}

package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {


		String file = System.getProperty("user.dir") + "\\configs\\conf.properties";
		
		try { 
			FileInputStream fis = new FileInputStream(file);
			
			fis.close();
			
			Properties prop = new Properties();
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("File was not found");
		}
		
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
System.out.println("End of code");
	}

}

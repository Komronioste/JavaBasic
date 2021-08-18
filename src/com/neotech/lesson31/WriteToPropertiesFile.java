package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		
		//We want to write to an existing file
		
		String filePath = "C:\\Users\\TWD Admin\\eclipse-workspace\\JavaBasic\\configs\\example.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);

			prop.setProperty("phonenumber", "1234455678");
			
			
			
		//To write to the file we need FileOutputStream
			
			FileOutputStream fos = new FileOutputStream(filePath);
			
			prop.store(fos, "I Just added a new property");
	}

}

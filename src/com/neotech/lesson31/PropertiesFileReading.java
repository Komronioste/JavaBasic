package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		//How to read the file?
		
		//1. Have a file, we need the location
		String filePath = "C:\\Users\\TWD Admin\\eclipse-workspace\\JavaBasic\\configs\\example.properties";
		
		//2. Create an object of FileInputStream
		
		FileInputStream fileInput = new FileInputStream(filePath);    //telling this method to read the file we declared in the String filePath.
		
		// to handle .properties files we need to use Properties java class
		
		Properties prop = new Properties();
		
		prop.load(fileInput);
		
		System.out.println(prop);
		
		String str = prop.getProperty("password");
		System.out.println(str);
		
		Set<Object> keys = prop.keySet();
		
		Collection <Object> values = prop.values();
		
		System.out.println(keys);
		System.out.println(values);
		
		for (Object key : keys)
			System.out.println(key);
		
		for (Object v : values)
			System.out.println(values);
		
		
	}
}

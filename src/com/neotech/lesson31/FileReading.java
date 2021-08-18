package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class FileReading {

	public static void main(String[] args) throws IOException {


		String filePath = "C:\\Users\\TWD Admin\\eclipse-workspace\\JavaBasic\\configs\\conf.properties";
		System.out.println(filePath);
		
		//Finding user directory
		
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);

		//Getting userName
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//Getting OS of your PC
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String dynamicPath = System.getProperty("user.dir") + "\\configs\\conf.properties";
		System.out.println(dynamicPath);
		
		FileInputStream fis = new FileInputStream(dynamicPath);
		
		Properties prop = new Properties(); 
		
		prop.load(fis);
		
		Set<Object> keys = prop.keySet();
		
		System.out.println(keys);
		
		Collection<Object> values = prop.values();
		
		System.out.println(values);
		
		
		
	}

}

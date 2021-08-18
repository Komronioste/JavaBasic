package com.neotech.lesson26;

import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		
	
	ArrayList<String> cars = new ArrayList<>();
	
	cars.add("Jaguar");
	cars.add("BMW");
	cars.add("TOYOTA");
	cars.add("FORD");
	
	

	
	//1st way of retrieving
	System.out.println(cars);
	
	System.out.println("--------------------------");
	
	//2nd way of retrieving
	for (String all : cars)
	{
		System.out.println(all);
	}
 	
	System.out.println("--------------------------");
	//3rd way of retrieving
	for (int i = 0; i < cars.size(); i++)
	{
		System.out.println(cars.get(i));
	}
}
}
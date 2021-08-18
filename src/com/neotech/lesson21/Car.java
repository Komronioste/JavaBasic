package com.neotech.lesson21;

public class Car {
	
	String make, model;
	
	Car()  //constructor
	{
		System.out.println("I am a parent default constructor");
		
	}
	
	Car(String make, String model) //constructor
	{
		this.make = make;
		this.model = model;
	}

}

class Mercedes extends Car {
	
	String sportsModel;
	
	Mercedes()  
	{ 
		//super("Mercedes", "E500");  // wont use parent's default constructor
		System.out.println("I am child default constructor");
	}
	
	Mercedes(String make, String model, String sportsModel)   //constructor
	{
		super.make = make;
		super.model = model;
		this.sportsModel = sportsModel;
	}
	
	Mercedes (String make, String model)
	{
		super(make, model);
		System.out.println("lets ssee");
		
	}
	
}
	
		
	
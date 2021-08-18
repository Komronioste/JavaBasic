package com.neotech.lesson14;

public class Phone {
	
	
	String make, model, color; 
	double price, displaySize;
	
	
	void phoneCalls()
	{
		System.out.println(model + " places calls well");
	}
	
	void reliability()
	{
		System.out.println(model + " doesnt break fast");
		System.out.println();
	}
	
	void generalInfo()
	{
		System.out.print(make + " " + model + " " + color + " " + displaySize + " " + price + "$" + "\n");
		
	}
}


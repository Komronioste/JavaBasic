package com.neotech.lesson19;

public class StaticKeyword {

	//instance variables
	String color;
	int memory;
	
	
	static String brand;
	static boolean touchscreen;
	
	
	void displaySpecificInfo()
	{
		System.out.println("We build a " + brand + " with " + memory + "GB memory with " + color + " color!");
	}
	
	
	static void displaySpecificInfo_2()
	{
		System.out.println("Brand is " + brand + " and touchscreen is " + touchscreen); //inside static methods, you cannot call instance variables.
	}
	
	
	public static void main(String[] args) {
		

		StaticKeyword.brand = "iPhone";
		StaticKeyword.touchscreen = true;
		
		StaticKeyword obj1 = new StaticKeyword();
		obj1.color = "black";
		obj1.memory = 64;
		
		obj1.displaySpecificInfo();
		
	
		
		StaticKeyword obj2 = new StaticKeyword();
		
		StaticKeyword obj3 = new StaticKeyword();
		
		
		
	}

}

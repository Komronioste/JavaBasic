package com.neotech.lesson20;



public class ConstructorTypes {


	public ConstructorTypes()
	{
		System.out.println("I am a non-argument constructor");
	}
	
	ConstructorTypes(String str) {
		
		System.out.println("I am a constructor with a string parameter");
	}
	
	public static void main(String[] args) {
	
		
		
		ConstructorTypes ct = new ConstructorTypes();
		
		
		
		
	}

}

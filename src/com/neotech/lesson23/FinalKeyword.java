package com.neotech.lesson23;

public class FinalKeyword {
	
	public static String hello = "Hello!";
	
	public static final String goodbye = "Goodbye!";
	
	public static final double age = 25;
	
	public static final int abc = 0;
	
	
	
	protected final void hello()
	{
		System.out.println("I am the final method");
	}
	
	protected final void hello (int a)
	{
		System.out.println("got a parameter");  // new method, not overriding. signature of method is different. 
	}
	
	public static void main(String[] args) {
		
		
	//	age = 26;   cannot be changed because its final
		
	}

}

final class SubClass extends FinalKeyword {
	
	//public void hello()   CANNOT override final method
	{
		System.out.println("I am child method");
	}
}

//class SubSubClass extends SubClass      // cannot extend final class

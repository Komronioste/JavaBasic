package com.neotech.lesson23;

public class Parent {

	
	Parent()
	{
		System.out.println("Parent class constructor");
	}
	
	private void hello()
	{
		System.out.println("Hello from the Parent Class");
	}
	
	static void bye()
	{
		System.out.println("Bye from the Parent Class");
	}
	
	}

class Child extends Parent {
	
	Child()
	{
		System.out.println("Child class Constructor");
	}
	
	
	
	
	private void hello()           //super.hello();   No access to the private method, so no overriding. We are just creating a private method.
	{
		System.out.println("Hello from Child Class");
	}
	
	static void bye()
	{
		System.out.println("Bye from the static Child Class");
	}
	
}

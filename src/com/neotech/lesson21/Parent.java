package com.neotech.lesson21;

public class Parent {
	
	
	String name = "Parent";
	String lastName = "Parent LastName";
	
	void hello()
	{
	System.out.println("I am the parent");	
	}
	
	}

class Child extends Parent{
	
	String name = "Child";
	int age = 10;
	
	void display()
	{
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(super.lastName);
	}
	
	void sayHello()
	{
		display();  // java itself adds this. keyword in front of this method.
		hello();	// java itself adds super. keyword in front of this method. because there are no duplicates.
		super.hello(); // we are specifying this is a method coming from superclass (parent class)
	}
	
}

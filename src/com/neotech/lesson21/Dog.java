package com.neotech.lesson21;

public class Dog extends Animal{  //Extends Animal  ==> Dog is a child of Animal now.

	String breed;
	
	public void bark()
	{
		System.out.println("Dogs bark");
	}
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.age = 15;
		d1.eat();
		
	}
	
	
}

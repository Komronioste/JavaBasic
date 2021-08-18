package com.neotech.lesson18;

public class Dog {

	
	//  Instance/object variables
	String name;
	int age;
	
	// static variable/ class variable
	static String breed = "Husky";
	static int paws = 4;
	
	
	void displayDogInfo()
	{
		System.out.println("Name: " + name + " age: " + age + " breed: " + breed + " paws: " + paws);
	}
	
	///////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {
		
	Dog dog1 = new Dog();
	
	dog1.name = "Bubi";
	dog1.age = 4;
	
	dog1.displayDogInfo();
	
	
	Dog dog2 = new Dog();
	
	dog2.name = "Chak";
	dog2.age = 3;
	
	
	dog2.breed = "Dobermann";  //Will change breed for all objects. OR
	Dog.breed = "Golden Retriever";
	
	dog1.displayDogInfo();
	dog2.displayDogInfo();
	
	Dog dog3 = new Dog();
	
	dog3.name = "Bob";
	dog3.age = 5;
	
	dog3.displayDogInfo();
	
	
		
	}
	
}

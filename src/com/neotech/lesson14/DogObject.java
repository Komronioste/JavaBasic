package com.neotech.lesson14;

public class DogObject {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog();
		
		dog1.age = 2;
		dog1.breed = "Huskey";
		dog1.color = "Black and White";
		dog1.size = "big";
		dog1.eat();
		dog1.name();
		dog1.run();
		dog1.sleep();
		System.out.println();

		Dog dog2 = new Dog();
		dog2.age = 3;
		dog2.breed = "labrador";
		dog2.color = "brown";
		dog2.size = "small";
		dog2.eat();
		dog2.name();
		dog2.run();
		dog2.sleep();
		System.out.println();
		
		Dog dog3 = new Dog();
		dog3.age = 10;
		dog3.breed = "bulldog";
		dog3.color = "black";
		dog3.size = "shuge";
		dog3.eat();
		dog3.name();
		dog3.run();
		dog3.sleep();
	}

}

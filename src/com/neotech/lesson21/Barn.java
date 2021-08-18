package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		a.age = 5;
		a.color = "Black";
		a.size = "Big";
		
		a.eat();
		a.sleep();
		a.displayInfo();
		
		Dog dog1 = new Dog();
		
		dog1.age = 3;
		dog1.color = "Gray";
		dog1.size = "Medium";
		dog1.bark();
		dog1.sleep();
		dog1.breed = "Husky";
		
		//when creating an object of the parent class, we dont have access to the child class features.
		// Dog d1: this object has access all the way up to Dog and Animal attributes and methods.
		
		Puppy p = new Puppy();
		
		p.age = 1;
		p.color = "White";
		p.size = "Small";
		p.eat();
		p.sleep();
		p.displayInfo();
		p.bark();
		
		Cat c = new Cat();
		c.age = 3;
		c.color = "white";
		c.size = "small";
		
		//we do not have access to the features and behaviors of Dog class.

	}

}

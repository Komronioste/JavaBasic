package com.neotech.lesson18;

public class Cat {

	
	//instance variables
	
	String name, color;
	int age;
	
	void sayMeow()
	{
		String word = "meow";
	}
	void displayCatInfo()
	{
		System.out.println("Name " + name + " and color is " + color);
	}
	
	
	
	
	public static void main(String[] args) {
	
Cat cat1 = new Cat();
cat1.name = "Lucy";
cat1.color = "White";
cat1.age = 2;

cat1.sayMeow();

Cat cat2 = new Cat();


cat2.name = "Felicia";
cat2.age = 3;
cat2.color = "Brown";

cat1.displayCatInfo();
cat2.displayCatInfo();

//We want to rename Lucy to Tekir
cat1.name = "Tekir";      // changing cat1 instance of name variable. will change only for cat1. cat2.name will keep old name.
cat1.displayCatInfo();
System.out.println(cat1.name + " is " + cat1.color);


	}

}

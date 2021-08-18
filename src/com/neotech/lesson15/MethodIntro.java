package com.neotech.lesson15;

public class MethodIntro {

	
	//Lets create a method for greeting

	void greet () {
		
		System.out.println("Hello");
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}
	
	//Lets create a method that will be greeting by name
	
	void greet2(String name) {															// (String name) - it is a parameter, in this case it is a String
		System.out.println("Hello " + name);
		System.out.println("How are you doing?");
		System.out.println("Bye " + name);
		
	}
	
	void hola(String country) {
		
		
		if (country.equals("USA"))
		{System.out.println("hello");}
		else if (country.equals("Spain"))
		{
			System.out.println("Hola!");
		}
	}
	
	public static void main(String[] args) {
		
		MethodIntro object = new MethodIntro();
		
		object.greet();
		object.greet();
		
		System.out.println();
		
		object.greet2("Komron");
		//object.greet2();  // This will give an error, since there is no parameter mentioned
		//object.greet2(123); // Compiling error, because we said that parameter needs to be a String
		//object.greet2('M'); // error
		object.greet2(""); // this works because there is an empty String
		
		object.hola("USA");  // input is case-sensitive
		
		
	}
}

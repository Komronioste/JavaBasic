package com.neotech.lesson16;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
	//1st way of creating a string . it's called String literal. short way
		String name = "Enes";
		
		//2nd way 
		String name2 = new String("Hakan");
		
		//Methods
		
		//length() How many characters
		String school = "Neotech Academy";
		int  length = school.length();  //will count all characters including symbols and spaces
		System.out.println(length);  
	
		// .length used in arrays is different, that one is a property. .length() is a method
		
		//toUpperCase() toLowerCase()
		String city = "Fairfax";
		String newCity = city.toLowerCase();  // will change every character to lower case or upper case
		System.out.println(newCity);
		
	System.out.println(city.toUpperCase()); // can use the method inside sout.
	
	//concat()  concatination
	
	String zip = "12345";
	String sentence = "The name of the city is " + city;
	String sentence2 = city.concat(zip);           //will add the argument to the string
	System.out.println(sentence2);
	
	String sentence5 = city.concat(" ").concat(zip);  //method chaining, using concat.
	System.out.println(sentence5);
	
	String sentence6 = city.concat(", ").concat("VA").concat(" ").concat(zip);  // method chaining. next concat method is added to previous method after executing
	System.out.println(sentence6);
	
	//isEmpty()
	String str = "Evis";
	boolean isEmp = str.isEmpty();   //isEmpty uses boolean to check if the string is empty or not, so will yield true or false.
	System.out.println(isEmp);
	
	String str2 = "";
	boolean isEmp2 = str2.isEmpty();
	System.out.println(isEmp2);  // if there is a character or space or a single letter, it will print false.
	
	//trim()  will remove unneeded spaces
	
	String school2 = "     The Neotech          Academy           ";
	System.out.println(school2.trim());  // will trim spaces on both sides/corners. wont trim spaces between words.
	
	//charAt()  - will get a char, so we have to mention the index of needed char in the parentheses.
	
	Scanner scan = new Scanner(System.in);
	char letter = scan.next().charAt(0);
	System.out.println(letter);
	
	//indexOf()
	String name3 = "Komron";
	int index = name3.indexOf('n'); //can use strings too and look up multiple characters "mr". will give index 2
	System.out.println("index is " + index); //will print index is 5m because n is 5th index. it's case sensitive. if it doesnt find the letter, it will print -1.
	
	//substring()
	String msg = "Komron is the best";
	String substr = msg.substring(5);  // means start the string with the mentioned index. so substr = n is the best.
			System.out.println(substr);
		int asd = msg.length();	
		System.out.println(asd);
	String substr2 = msg.substring(0, 5);  //will print the range from 0 to 5 index, excluding 5. substr2 = Komro  . if index doesnt match, it will give error - saying out of range.
	System.out.println(substr2);  
			
	//contains() --- checks if string contains mentioned property/text, returns boolean.
	String sent = "Today is 4th of July";
	boolean contains = sent.contains("Today");
	System.out.println(sent + " contains " + "Today --->" + contains);
	
	//startsWith()
	boolean starts = sent.startsWith("July"); // will print false, because it doesnt start with July.
System.out.println(starts);

	//endsWtih() - checks if the string ends with a given text. returns boolean

	//equals() checks if one string is equal to another equal

String str5 = "SATURDAY";
String str6 = "saturday";
boolean equals = str5.equals(str6);
System.out.println("equals " + equals);

boolean eq2 = str5.equalsIgnoreCase(str6);
System.out.println("equalIgnoreCase >> " + str6);
	}

}

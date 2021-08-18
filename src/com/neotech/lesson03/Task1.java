package com.neotech.lesson03;

public class Task1 {

	public static void main(String[] args) {

		String name = "Komron";
		String lastName = "Babakhanzoda";
		char grade = 'A';
		String city = "Falls Church";
		String state = "VA";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
		city = "Fairfax";
		state = "Virginia";
		long phoneNumber = 7776665544l;
		grade = 'B';
		
		System.out.println();
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// If we want to print everything in one sentence we should use Concatenation
		
		System.out.println(name + lastName + grade + city + state); //but everything will print as one word KomronBabakhanzodaB
		System.out.println(name + " " + lastName + "  " + grade + "   " + city); // you have to add double quotations with space in them so your sentence prints with spaces.
	}

}

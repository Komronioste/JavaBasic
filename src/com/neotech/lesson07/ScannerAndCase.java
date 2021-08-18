package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndCase {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner (System.in);
		
		String country;
		
		System.out.println("Where are you from?");
		
		country = scan.next();
		
		if (country.equals("Albania"))  //checking if country is Albania
		{
			System.out.println("You speak Albanian");
		}
			
		else if (country.equals("USA"))
			
		{
			System.out.println("You speak English");  //user input is case sensitive as well
		}												// if we input usa instead of USA, it will print "idk your language".
		
		else if (country.equals("Turkey"))
		
		{
			System.out.println("You speak Turkish");
		}
		
		else {
			System.out.println("Idk your language");
		}
		
		
		// ------------------ USING SWITCH-----------------
		
		
		switch (country)
		{
		case "Albania":
			System.out.println("you speak Albanian");
			break;
		
		case "UK":					// since we dont have a break, UK input will print out USA statement.
		case "USA":
		case "Aussie": 				// same with Aussie
			System.out.println("you speak English");
			break;
		
		case "Turkey":
			System.out.println("You speak Turkish");
			break;
			
		default:
			System.out.println("I dont know ur language");
		}
		
	}

}

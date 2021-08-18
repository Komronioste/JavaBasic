package com.neotech.lesson08;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		// 2. Write a program that asks user to enter his/her username and password until user enters them correctly.

		String pass;
		
		System.out.println("Please enter your password");
		pass = scan.next();
		
		if (pass.equals("neotech"))
		{System.out.println("Welcome");}
		else if (pass != "neotech") {
			
			while (pass != "neotech")
			{System.out.println("Try again");
			pass = scan.next();
		
			if (pass.equals("neotech")) 
		{  pass = "neotech";
			System.out.println("WELCOME");
		}
		}
		}
//		
			
		}
		

	}



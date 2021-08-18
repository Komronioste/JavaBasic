package com.neotech.lesson08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
	
		
		
		// 2. Write a program that asks user to enter his/her username and password until user enters them correctly.

		Scanner scan = new Scanner (System.in);
		
		String pw;
		
		System.out.println("Please enter your password");
		
		pw = scan.next();
		
		if (pw.equals("hello"))

		{ 
			System.out.println("Welcome");
		}
		
		else if (pw != "hello")
		{
			while ( pw != "hello")
			{
				System.out.println("please try again");
				pw = scan.next();
			
				
				if (pw.equals("hello"))
					
					
				{System.out.println("Welcome");
				pw = "hello";
				}
		
			}
		}
	
	}

}
package com.neotech.lesson09;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		String a;
		//Ask user to apply for credit card 10 times
		// as soon as you get a "yes" from user, program should stop.
		
		for (int times = 0; times <= 10; times++)
		{
			System.out.println("Please apply for credit card");
			
		
		a = scan.next();
		
		if (a.equalsIgnoreCase("yes"))
		{
			System.out.println("You are approved");
			break; 
			}
		
	}
	
	}

}

package com.neotech.lesson10;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		// Write a program that asks user to enter his/her username and password until user enters them correctly.
	
		
		Scanner scan = new Scanner (System.in);
		
		
		
		String un;
		String ps;
		boolean flag =true;
		
		
		
		
		do {
		System.out.println("Enter username and password");
		un = scan.next();
		ps = scan.next();
		
		if (ps.equals("sabah") && un.equals("bushaj"))
		{
			System.out.println("Welcome");
			break;
		}
		
		}
		while(flag);
		
		
	}

}

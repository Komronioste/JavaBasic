package com.neotech.lesson07;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		char math;
		
		int num1, num2;
		
		System.out.println("Please enter first number");
		
		num1 = scan.nextInt();
		
				
		System.out.println("Please choose one of the signs, + , -, /, *");
		
		math = scan.next().charAt(0);
		
		System.out.println("Please enter second number");
		
		num2 = scan.nextInt();
		
				
		switch (math)
		{
		
		case '+':
			System.out.println("Your number is: " + (num1 + num2));
			break;
			
		case '-':
		System.out.println("Your number is: " + (num1-num2));
			break;
		
		case '/':
		System.out.println("Your number is: " + (num1/num2));
			break;
			
		case '*':
			System.out.println("Your number is: " + (num1 * num2));
			break;
		
		}
		
	}

}

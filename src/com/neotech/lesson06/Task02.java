package com.neotech.lesson06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your number");
		
		int num1 = input.nextInt();
		
		System.out.println("Please enter another number");
		
		int num2 = input.nextInt();
		
		System.out.println("the sum of your numbers is " + (num1+num2));
		
	}
}

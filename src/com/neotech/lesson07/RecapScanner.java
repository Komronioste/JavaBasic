package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
//		int age;
//		int year;
//		
//		System.out.println("What is your age?");
//		age = scan.nextInt();
//		System.out.println(age);
//		System.out.println("Year of your birth?");
//		year = scan.nextInt();
//		System.out.println(year);
//		
//		
//		
//		double salary;
//		
//		System.out.println("What is your salary?");
//		salary = scan.nextDouble();
//		System.out.println("The salary is " + salary);
//
//		
//		boolean isRaining = true;
//		System.out.println("Is it raining?");
//		System.out.println(isRaining);
		
		char gender;
		System.out.println("What is your gender (M or F):");
		gender = scan.next().charAt(0);
		System.out.println(gender);
		
		
		
	}
	

}

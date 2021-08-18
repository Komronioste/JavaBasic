package com.neotech.lesson07;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		char grade;
		
		System.out.println("Please, enter your grade;");
		
		grade = scan.next().charAt(0);
		
		switch (grade)
		
		{
		
		case 'A':
		System.out.println("Your grade is A, Excellent");
		break;
		
		case 'B':
		System.out.println("Your grade is B, Good");
		break;
		
		case 'C':
		System.out.println("Your grade is C, Average");
		break;
		
		case 'D':
		System.out.println("D, You are stupid");
		break;
		
		default:
			System.out.println("Not acceptable");
		
		
		}
		
	}

}

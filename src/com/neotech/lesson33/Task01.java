package com.neotech.lesson33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int first = 0;
		int second = 0;

		try {

			System.out.println("Please provide first number to divide: ");

			first = scan.nextInt();

			System.out.println("Please provide a number to divide by: ");

			second = scan.nextInt();

			System.out.println(first / second);
		}

		catch (InputMismatchException e) {
			System.out.println("Provide numbers, dumbo!!! " + e.toString());
		}
		
System.out.println(first); // wont run if not initialized
System.out.println(second);
	}
}

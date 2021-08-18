package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// arithmetic operators

		// Declaring a set of same variables
		int num1, num2; // or you can use int num1; num2;

		// initialize - give a value
		num1 = 25;
		num2 = 5;

		double d1, d2;
		d1 = 6.99;
		d2 = 3.5;

		int sum = 0;
		int mult = 0;
		int div = 0;

		sum = num1 + num2;
		mult = num1 * num2;
		div = num1 / num2;

		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The product of the numbers is:  " + mult);
		System.out.println("The division of thse numbers is: " + div);

		double div_d = 0;

		div_d = d1 / d2;

		System.out.println(div_d);

		// if we used div_d as int instead of double, it would just print our answer without decimals.
		// not choosing right data types will yield to loss of information
	}
}

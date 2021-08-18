package com.neotech.lesson03;

public class ShortHandIntro {

	public static void main(String[] args) {

		int num1 = 6;
		int num2 = 6;
		int sum = 0;

		sum = num1 + num2; // add to sum the numbers num1 and num2.

		// what if we want to change num1 itself

		// one way is reassigning
		num1 = 8;

		// another way is adding another value to it
		num1 = num1 + 8; // 5+8. this is used to keep what you have and add more to it.
		sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(sum);
	}
}

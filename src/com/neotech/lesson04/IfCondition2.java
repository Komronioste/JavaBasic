package com.neotech.lesson04;

public class IfCondition2 {

	public static void main(String[] args) {

		// if you have more than $5000 in your bank
		// then you can buy LV bag

		int money = 9000;

		if (money > 5000) { // if condition is true, whatever is in curly brackets, will print.

			System.out.println("I can buy LV bag");
			System.out.println("I am happy");
		}

		System.out.println("I am outside of the mall.");

		System.out.println();
		System.out.println();

		int balance = 1200;
		if (balance > 5000) {
			System.out.println("I can buy LV bag");
		}

		System.out.println("I am outside the mall.");
		
		System.out.println("-------------------");
		
		//if you practice Java 15 hrs per week
		//if you are practicing 15 hrs or more, you will love Java
		//otherwise you will hate it
		
		int practiceHours = 1;
		
		if (practiceHours >= 15) {
			
			System.out.println("You will love Java!!!");
		}
		else {  // if 'if' condition is false, 'else' will print. if 'if' is true, else won't print.
			System.out.println("You will hate Java!");
		}
		
		System.out.println("This part will print regardless!");
	}

}

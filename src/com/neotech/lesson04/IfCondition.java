package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {

		// Declare a number and compare if the number is larger than 100
		// if it is larger that 100, lets print my number is large

		int num = 79;
		if (num > 100) {  // basically, if num is greater than 100, then print My number is large.
			System.out.println("My number is large");  //won't print because the statement is false.
		}

		System.out.println("End of code1");
		
		System.out.println("--------------");
		
		num = 157;
		boolean condition = num > 100;
		
		if (condition ) { 
			
			System.out.println("My number is large"); //printed because it's true.
		}
		
		System.out.println("End of code2"); //prints regardless, because doesnt have any conditions.
		
		
		
	}
}

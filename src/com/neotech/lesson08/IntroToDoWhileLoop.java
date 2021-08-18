package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {
		
		int  num = 5;
		
		while (num<15)                  // while condition is true, do something
		{								// check the condition, then run the code if condition is true until false				
			System.out.println(num + " ");
			
			num++;    // this code keeps adding one to our 'num' until it reaches 15, which makes our code stop
			
		}

		
		int num2 = 5;
		
		do {														// do something while condition is true
		
			System.out.println(num2+ " ");	
			num2++;								// run the code first, then check for condition, if condition is true, run again
		
		}
		while(num2>15);
		
		
		System.out.println(num);
		
		
		
	}

}

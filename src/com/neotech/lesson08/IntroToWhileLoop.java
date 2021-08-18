package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time = 8;
		
		while (time < 12)   // since condition is true (10<12), it will keep printing our message.
			
		{
			System.out.println("Time is: " + time);
			
			time++;
			
			System.out.println("this line is executed");
			
		}
			
		
		//Print numbers from 1 to 50
		
		int num = 1;
		
		while (num<=50)
		{
			
			System.out.println(num);
			num++;
		
		}
		
		//how to print numbers from 20 to 30
		
		int num1 = 20;
		
		while (num1 <=30)
			
		{
			System.out.print(num1 + " ");
			num1++;
			
		}
		
		
		
	}

}

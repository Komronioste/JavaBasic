package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("BREAK");
		for (int i = 1; i <= 10; i++)
		{
			if (i==4) 
			{
				System.out.println("I reached the break statement");
				break;  // breaks the loop or switch the statement
			}
			System.out.println(i);
		}
		
		System.out.println("CONTINUE");
		
		for (int i = 1; i <= 10; i++)
		{
			if (i==4) 
			{
				System.out.println("I reached the break statement");
				continue;   //skips the specified value
			}
			System.out.println(i);
		}
		
	}

}

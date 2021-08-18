package com.neotech.lesson07;

public class LogicalNot {

	public static void main(String[] args) {
	
		
		// ! true = false   !false = true  ! (NOT) - reversing the value if a boolean variable
		
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
		
		// != not equal if (number !=5)
		
		// ! is put in front of a boolean
		
		boolean cold = false;
		
		
		if (!cold) {
			
			System.out.println("cold!");
			
		}
		
		else
		{System.out.println("not hot!");}
		
		
boolean hot = !false;
		
		
		if (hot) {
			
			System.out.println("hot!");
			
		}
		
		else
		{System.out.println("not hot!");}
		
		
		
		boolean isRaining = !false;
		
		if (isRaining)
		{System.out.println("Not raining");}  // since !false = true, and condition for if , it will print Not raining
		
		else
		{System.out.println("Raining");}
		
		
		
		
		
		
		
	}

}

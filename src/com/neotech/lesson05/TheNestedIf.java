package com.neotech.lesson05;

public class TheNestedIf {
	
	public static void main(String[] args) {
		
		// if it is morning --- say "good morning"
				//if it is morning and a school day ---- 
		// else ----  say "it's not morning"
		
		
		
		boolean isMorning = true;
		boolean schoolDay = true;
		int time = 16;
		
	
		if (isMorning)  // if morning is true then it checks inside the if block
		{
			
			System.out.println("Good Morning");
			
			if (schoolDay)
			{
				System.out.println("You are at school"); 
				}
			
			
			else // it is not a schoolDay
				
			{
				System.out.println("Hangout with family");
				}
		
				
			}
			
			
		
		else 		{
			System.out.println("It is not morning");
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

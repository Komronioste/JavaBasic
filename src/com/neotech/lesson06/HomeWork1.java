package com.neotech.lesson06;

public class HomeWork1 {
	
	
	public static void main(String[] args) {
		
		//ctrl+shift+f will format the code
		
		// nested if - is if inside another if
		
		boolean allergy = true;
		boolean peanut = true;
		boolean bee = false;
		boolean seafood = true;
		boolean lactose = true;
		
		if (allergy)
		{
			
			System.out.println("You have allergy"); // when first 'if' is true, chech nested 'if's and print all the true statements. 
			//when first 'if' is false, print else.
			
			
			if (peanut) { System.out.println("Don't Eat Peanuts"); }
			
				else {System.out.println("You can eat peanuts"); }
					
			if (bee) { System.out.println("Don't eat honey"); }
			
				else {System.out.println("You can eat honey");}
			
			if (seafood) {System.out.println("Don't eat seafood"); 			}
			
			if (lactose) {System.out.println("Don't drink milk"); }
			
			
			
			
		}
		
		else 
		{
			System.out.println("You are healthy");
		}
		
	}

}

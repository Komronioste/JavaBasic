package com.neotech.lesson05;

public class Lesson05Homework01 {

	public static void main(String[] args) {
		
		//To check if patient has allergies. 
		//If the patient has no allergies, print "You're healthy!"
		//IF person has allergies, check if it is PEANUT, LACTOSE, BEE, or SEAFOOD?
			// print "Don't eat ----" whatever causes allergy
		
		boolean allergy = true;
		boolean seafood = true;
		boolean peanut = false; 
		boolean lactose = true;
		boolean bee = false;
		
		if (allergy) {
			
			if (seafood) { System.out.println("Don't eat seafood"); 			}
			if (peanut) {System.out.println("Don't eat peanuts");}
			if (lactose) {System.out.println("Don't eat lactose!"); }
			if (bee) {System.out.println("Don't eat bee");
					}
		
			
	}
		else { System.out.println("You are healthy!"); }
}
}
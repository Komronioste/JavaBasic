package com.neotech.lesson05;

public class Lesson05Homework02 {

	
	
	public static void main(String[] args) {
		
		// if hour is less than 12, greet with good morning
		// if hour is greater than or equal 12 noon but less than 3pm, greet with Good Afternoon
		// if hour is greater than or equal to 3pm, greet with Good evening.
		
		int time = 14;
		
		if (time<12)
		{System.out.println("Good morning!"); }
		else if (time >= 12) {
			
			if ( time < 15) System.out.println("Good Afternoon!");}
		
		 if ( time > 15) {System.out.println("Good Evening!"); }
		else {}
		
	}
}

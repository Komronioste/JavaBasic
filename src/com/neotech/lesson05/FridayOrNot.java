package com.neotech.lesson05;

public class FridayOrNot {

	
	public static void main(String[] args) {
		
		
		boolean Friday = true;
		int date = 17;
		
		if (Friday) {
			
			System.out.println("It's Friday. I will watch a movie");
			
			if (date==13) {
				
				System.out.println("I will watch scary movie");
			}
			
			else {
				
				System.out.println("I will watch a comedy");
			}
			
					}
		else {
			System.out.println("It's not Friday. I will study Java");
		}
		
	}
}

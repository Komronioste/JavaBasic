package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		
		double d1 = 12.2;
		double d2 = 12.3;
		
		// d1<d2 is the same as d2>d1
		// possible conditions:
		// d1 is bigger than d2
		// d1 is smaller than d2
		// d1 is equal to d2
		
		if (d1<d2) {	System.out.println("Number " + d1 + " is smaller than " +d2);	} // d1 is smaller than d2
		
		else if (d1==d2) {System.out.println("Number " + d1 + " is equal to " + d2);} // d1 is larger than d2
		
		else {System.out.println("Number " + d1 + " is equal to " + d2);}  // this means that d1 == d2
		
		
		
		int a = 5;
		int b = 6;
		
		// we can have 3 possible conditions
		// 1. a is larger than b
		// 2. a is smaller than b
		// 3. a is equal to b
		
		if (a==b) { System.out.println("Number 5 is equal to 6"); }
		else if (a<b) { System.out.println("Number 5 is smaller than 6");}
		else { System.out.println("Number 5 is larger than 6");}
		
	}




	

}
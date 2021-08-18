package com.neotech.lesson04;

public class RelationalEqualityOperators {

	public static void main(String[] args) {

		System.out.println(3 > 4); // will yield "false"

		int a = 8;
		int b = 10;

		System.out.println(a > b); // will print false

		System.out.println(b > a); // will print true, because it is true.

		int c = 10;

		System.out.println(c > b); // will print false because 10 isn't greater than 10.

		System.out.println(c == b); // equality is denoted as a double equal sign "=="

		System.out.println(c != b); // is it different denoted as "!="
		
		
		System.out.println("*************************");
		
		double d1 = 5.64;
		double d2 = 5.64;
		
		boolean result = d1 > d2;  // is d1 greater than d2? expecting true or false answer.
		
		System.out.println("The result is: " +result); 

		boolean result2 = d1==d2;
		System.out.println(result2);
		
		boolean result3 = d1<d2; // will print false because they are equal.
		System.out.println("The result3 is: " +result3);
	
	boolean result4 = d1<=d2;
	System.out.println("The result4 is: " + result4);
	
	boolean result5 = d1>=d2;
	System.out.println("The result5 is: " +result5);
	
	boolean result6 = d1!=d2;
	System.out.println("The result6 is: " +result6);
	
	
	
	}
	
	

}

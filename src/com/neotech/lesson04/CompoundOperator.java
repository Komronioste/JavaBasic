package com.neotech.lesson04;

public class CompoundOperator {
	
	public static void main(String[] args) {
		
		//compound operator aka shorthand operator
		
		
		int num = 100; //create a box and store 100 in it. 
		
		num = num+100; // we telling java to add 100 to the existing value
		System.out.println(num); // now the value of num is 200
		
		
		num += 100; // now the value is 300
		
		System.out.println(num);
		
		// num *= 10; is the same as num = num * 10;
		
		num *=2; 
		System.out.println(num);
		
		num %=27;
		
		System.out.println(num);
		
		// existing combinations: += , -=, /=, *=, %= .
		
	}

}

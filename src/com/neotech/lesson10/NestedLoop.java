package com.neotech.lesson10;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		
		//nested loop = a loop inside a loop

		for ( int i = 0; i<5; i++)
			
		{
			
		System.out.println("Outer loop");	
			System.out.println("i: " + i);
			
		for ( int j = 0; j <5; j++)						//outer loop will execute once, inner loop will execute 5 time, then outer loop will execute once, then inner loop will run 5 times
		{															// outer loop won't execute again until inner loop doesnt run completely. 
			System.out.println("inner loop");
			System.out.println("j: " +j);
			System.out.println("end of inner loop");
		}
			
		System.out.println("End of outer loop");
		}
		
		
		
		
		
		
	}

}

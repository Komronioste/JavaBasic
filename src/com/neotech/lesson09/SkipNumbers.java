package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// print numbers from 1 to 10 but skip 4,6,9.
		
		for ( int j = 1; j<=10; j++)
		{
			if (j == 4 || j == 6 || j ==9)
			{ continue;}
			
			System.out.print(j + " ");
		}
		
		System.out.println("***********************");
		
		for ( int i =10; i<=50; i++)
		{
			if (i>=25 && i<=45)
			{
				continue;  // if(){continue;} skips the mentione values
			}
			System.out.print(i + " ");
		}
		
		
	}

}

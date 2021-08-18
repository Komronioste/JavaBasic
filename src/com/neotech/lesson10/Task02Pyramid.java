package com.neotech.lesson10;

public class Task02Pyramid {

	public static void main(String[] args) {
		
		
	
		
		
		
	
		
		
		for (int rows = 0; rows <5; rows++)  // this loop responsible for rows
		{
			
			for (int space =5; space > rows; space--)  // this loop is responsible for spaces before stars
														// we need more spaces on top of pyramid than bot
			{
				System.out.print(" ");
			}
			
			
			for (int columns = 0; columns<=rows; columns++)

			{	
				System.out.print("* ");
			}
			
			
			System.out.println();
			
		}
		
		
		

	}
}


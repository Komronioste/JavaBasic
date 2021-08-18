package com.neotech.lesson10;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter a positive number and watch magic happen");
		
		int input = scan.nextInt();
		
		for ( int rows = 0 ; rows <= input; rows++)

		{

			for ( int i = 0; i<rows; i++)
				
			{	
				System.out.print("+");
			}
			
			
			for (int columns = input; columns > rows; columns--)

			{

			
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}



//for ( int rows = 0 ; rows <= input; rows++)
//
//{
//
//	for ( int i = 0; i<rows; i++)
//		
//	{	
//		System.out.print(" ");
//	}
//	
//	
//	for (int columns = 9; columns > rows; columns--)
//
//	{
//
//	
//		System.out.print("* ");
//	}
//	System.out.println();
//
//}

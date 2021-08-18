package com.neotech.lesson10;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number and watch magic happen");
		
		int input = scan.nextInt();
		
		for (int rows = 1; rows<=input; rows++)
		{
			
		
		
		for (int columns = 1; columns<=rows; columns++)
			
		{ 
			System.out.print(columns +" " );
		}
		
			System.out.println();
		
		}
		
		
		
		for (int rows = input-1; rows>=1; rows--)
		
		{	
			for (int columns = 1; columns<=rows;columns++)
				
			{
		
				System.out.print(columns + " ");
			
			}
		
	
			System.out.println();
		
		}
		
	}

}


//
//for (int rows = 1; rows<=5; rows++)
//{
//	
//
//
//for (int columns = 1; columns<=rows; columns++)
//	
//{ 
//	System.out.print(columns);
//}
//
//	System.out.println();
//
//}
//
//
//
//for (int rows = 5; rows>=0; rows--)
//
//{	
//	
//	for (int columns = 1; columns<=rows-1;columns++)
//
//	{
//		System.out.print(columns);
//	
//	}
//
//
//	System.out.println();
//}


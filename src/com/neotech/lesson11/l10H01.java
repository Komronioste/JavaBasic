package com.neotech.lesson11;

import java.util.Scanner;

public class l10H01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		System.out.println(" enter a number ");
		
		num = scan.nextInt();
		
		for ( int i = num; i>0; i--)								//1st loop: i =3, num =3, j starts at 0 then goes up to num-2, which is 0, so no print on first line.
		{															// 2nd loop: i=2, num =3, j starts at 0 and goes up to 1 , so 1 space on 2nd line. 
			
			
			
			
			for ( int j = 0; j<num-i; j++)
			{
				System.out.print(" ");
			}
			
			for (int k = 0; k<i; k++)
			{
				System.out.print("^ ");
			}
			
			
			
			System.out.println();
		}
		
		scan.close();

	}

}

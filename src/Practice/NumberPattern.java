package Practice;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		
		int x = scan.nextInt();
		
		for ( int i = 1; i<=x; i++ )
		{
			
			for (int a = x; a>=i; a-- )
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <=i; j++)
			{
				System.out.print(" ");
				System.out.print(i);
				
			}
			System.out.print(" ");
			System.out.println();
		}
		
		for ( int i = x; i>=1; i--)
		{
		

			for ( int a = x+1; a>=i; a--)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i-1; j++)
			{
				System.out.print(" ");
				System.out.print(i-1);
			}
			
			
			
			System.out.println();
		}

	}

}

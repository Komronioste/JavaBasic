package Practice;

import java.util.Scanner;

public class l10H02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Please enter a number");
		
		int a = scan.nextInt();
		
		
		for ( int i = 1; i <= a; i++)
		{
			
			for ( int j = 1; j<=i; j++)
			
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		for ( int i = a-1; i >= 1; i--)
		{
			for ( int j = 1; j <=i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}

package Practice;

import java.util.Scanner;

public class l10H01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Pleae enter a number");
		
		int b = scan.nextInt();
		
		for ( int i = 0; i<=b; i++)
		{
			
			for (int a = 0; a<=i; a++) 
			{
				System.out.print(" ");
			}
			
			for (int j = b; j>=i; j--)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
		}

		
		
		
	}

}

package Practice;

import java.util.Scanner;

public class BroNestedLoops {

	public static void main(String[] args) {
	
		
		//nested loop = a loop inside of a loop

		Scanner scan = new Scanner (System.in);
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter number of rows: ");
		rows = scan.nextInt();
		System.out.println("Enter number of columns");
		columns = scan.nextInt();
		System.out.println("Enter a symbol to use");
		symbol = scan.next();
		
		for (int i = 1; i<=rows; i++)
		{
			System.out.println();
			for (int j = 1; j<=columns; j++)
			{
				System.out.print(symbol);
			}
		}
	
	
	}

}

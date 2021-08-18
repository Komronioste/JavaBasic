package Practice;

import java.util.Scanner;

public class BroNestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int rows;
		int columns;
		String symbol;
		
		System.out.println("Please enter # of rows.");
		rows = scan.nextInt();
		
		System.out.println("Please enter # of columns.");
		columns = scan.nextInt();
		
		System.out.println("Enter symbol to use.");
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

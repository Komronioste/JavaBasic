package Practice;

import java.util.Scanner;

public class Homework0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner loan = new Scanner (System.in);
		
		System.out.println("What is the amount you need?");
		
		int amount = loan.nextInt();
		
		if (amount <= 200000)
		{ System.out.println("Your loan request is approved"); }
		
		else { System.out.println("Your loan request is denied"); }
		
	}

}

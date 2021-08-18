package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		int num;
		
		do {
			System.out.println("Guess the number");
			num = scan.nextInt();
		} while (num!=7);
		
		System.out.println("You are the winner");
		
	}

}

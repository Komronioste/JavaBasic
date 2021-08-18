package com.neotech.lesson09;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a positive integer");
		int n = scan.nextInt();
		int t = 0;
		while (t < 10)
		{
			t++;
			System.out.println(t + " * " + n + " = " + (t*n));
				
	}

}
}

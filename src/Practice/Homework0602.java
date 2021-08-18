package Practice;

import java.util.Scanner;

public class Homework0602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to DMV");
		System.out.println("How old are you?");
		
		int age = scan.nextInt();
		
		if (age >= 18)
		{ System.out.println(" You are old enough for Driver's License"); }
		
		else {
			System.out.println("You are too young, but you can have a permit");
		}
		
	}

}

package Practice;

import java.util.Scanner;

public class Homework0604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches.");
		
		double height = scan.nextDouble();
		
		if (height<60) 
		{System.out.println("You are short");}
		else if (height >= 60 && height <=72) {
			System.out.println("You are medium");
		}
		
		else { System.out.println("You are tall"); }
	}

}

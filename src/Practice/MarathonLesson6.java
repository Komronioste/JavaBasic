package Practice;

import java.util.Scanner;

public class MarathonLesson6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your first name");
		String name = scan.next();
		System.out.println("Please enter your last name");
		String lastName = scan.next();
		System.out.println("Your full name is " + name + " " + lastName);
		
		
		//*******************
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		int sum = num1+num2;
		System.out.println("Sum of entered numbers is " + sum);
		
		
		//*********************
		
		System.out.println("Please enter 1st num");
		int num3 = scan.nextInt();
		System.out.println("Please enter 2nd num");
		int num4 = scan.nextInt();
		
		if (num3>num4)
		{System.out.println("Number " + num3 + " is larger than " + num4 + "." );
		}
		else {System.out.println("Number " + num4 + " is larger than " + num3 + "."); }
		
		
		//***************
		
		System.out.println("Please enter your height in inches");
		int height = scan.nextInt();
		if ( height < 60)
		{
			System.out.println("You are short");
		}
		else if (height >=60 && height <=72)
		{System.out.println("You are medium");
		}
		else {System.out.println("You are tall");}
		
		
		
	}

}

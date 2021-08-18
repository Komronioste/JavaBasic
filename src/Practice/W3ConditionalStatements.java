package Practice;

import java.util.Scanner;

public class W3ConditionalStatements {

	public static void main(String[] args) {

		// 1. Write a Java program to get a number from the user and print whether it is
		// positive or negative.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");

		int num = scan.nextInt();

		if (num < 0) {
			System.out.println(num + " is a negative number");
		} else if (num > 0) {
			System.out.println(num + " is a positive number");
		}

		else {
			System.out.println("Invalid Input");
		}

		// 2.
		

		// 3. Take three numbers from the user and print the greatest number.

		System.out.println("Please enter 3 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {

			System.out.println("The greatest number out of three is: " + n1);
		}
		else if (n2> n1 && n2> n3)
		{System.out.println("The greatest number out of three is: " + n2); }
		else {System.out.println("The greatest number out of three is: " + n3);}
		
		//4.Write a Java program that reads a  number and prints "zero" if the number is zero.
		//Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
		
		System.out.println("Please enter any number");
		double num1 = scan.nextDouble();
		
		if ( num1 > 0 )
		
		{
			
			if (num1>1000000)
			{System.out.println("Your number is large");}
			
				
		else if (num1<1)
		{
			
			System.out.println("Your number is small");
					
		}
		System.out.println("Your number is positive ");
		}
		else if (num1<0)
		{System.out.println("Your number is negative");}
		
		else { System.out.println("Zero"); }
		
		
		//5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
		
		System.out.println("Please enter a number from 1 to 7");
		int week = scan.nextInt();
		
		switch (week)
		
		{
		case 1:
		{System.out.println("It's a Monday");
		break;
		}
		case 2:
		{System.out.println("It's a Tuesday");
		break;}
		case 3:
		{System.out.println("It's a Wednesday");
			break;}
		case 4:
		{System.out.println("It's a Thursday");
			break;}
		case 5:
		{System.out.println("It's a Friday");
		break;}
		case 6:
		{System.out.println("It's a Saturday");
		break;}
		case 7: 
		{System.out.println("It's a Sunday");
		break;}
		default: System.out.println("Invalid Number");
		}
		
						//OR//
		
	System.out.println("Please enter a number!");
	int d = scan.nextInt();
	String dayName;
	
	switch (d)
	{
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default: dayName = "Wrong Number!";
			
		
		}
		System.out.println("It's " + dayName);
			
		
		//6.
		
		//7. Write a Java program to find number of days in a month.
		
		System.out.println("Please enter the number of a month");
		int numOfMonths = scan.nextInt();
		
		switch (numOfMonths)
		{
		
		case 1: System.out.println("31 days in January.");
		break;
		case 2: System.out.println("29 days in February");
		break;
		case 3: System.out.println("31 days in March");
		break;
		case 4: System.out.println("30 days in April");
		break;
		case 5: System.out.println("31 days in May.");
		break;
		case 6: System.out.println("30 days in June.");
		break;
		case 7: System.out.println("31 days in July");
		break;
		case 8: System.out.println("31 days in August");
		break;
		case 9: System.out.println("30 days in September");
		break;
		case 10: System.out.println("31 days in October");
		break;
		case 11: System.out.println("30 days in November");
		break;
		case 12: System.out.println("31 days in December");
		break;
		default: System.out.println("Such month does not exist");
		}
		
		
		//8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
		//depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
		
		System.out.println("Please enter a letter.");
		String letter = scan.next();
				
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		
		
	
		
	}
	}



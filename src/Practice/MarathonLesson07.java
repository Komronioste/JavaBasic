package Practice;

import java.util.Scanner;

public class MarathonLesson07 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your model of PC: Apple, Dell, Acer, or any other");
		
		String pc = scan.next();
		
		switch (pc)
		{
		case "Apple":
		{
			System.out.println("No viruses");
			break;
		}
		case "Dell":
		{
			System.out.println("Tough one");
			break;
		}
		case "Acer":
		{
			System.out.println("Cheap one");
			break;
		}
		default: {System.out.println("Dont buy");}
		
		}
		
		System.out.println("Please enter a number 1-7");
	
		int day = scan.nextInt();
		
		switch (day)
		{
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Wrong input");
		}	
			
		System.out.println("Where are you from?");
		String country = scan.next();
		
		switch (country)
		{
			case "USA": System.out.println("You speak English");
			break;
			case "Albania": System.out.println("You speak Albanian");
			break;
			case "Turkey": System.out.println("You speak Turkish");
			break;
			default: System.out.println("Idk what language you speak");
				
		}
		
		
		
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter operator");
		String op = scan.next();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		if (op.equals("+"))
		{System.out.println(num1 + " + " + num2 + " = " +  (num1+num2));}
		else if (op.equals("-"))
		{System.out.println(num1 + " - " + num2 + " = " + (num1-num2));}
		else if (op.equals("*"))
		{System.out.println(num1 + " * " + num2 + " = " + (num1*num2));}
		else if (op.equals("/"))
		{System.out.println(num1 + " / " + num2 + " = " + (num1/num2));}
		
		System.out.println("--------------------------------");
		//Lesson 8****
		
		boolean workDay = true;
		int day1 = 1;
		
	
		
		for (int i = 1; i < 6; i++)
		{
			System.out.println("I need a day off");
		day1++; 
		
		if (day1>=6)
		{workDay=false;}
			
		}	
				System.out.println("I dont need off");
	
		
				
		
		int num10=0;
		int even = 0;
		for ( int i = 0; i<=10; i++)
			{
					num10++;
					if (num10%2==0)
			{
						even+=num10;
			}
			}
					System.out.println("even: " + even);		
				
		
				
			
		
			
		
	}

}

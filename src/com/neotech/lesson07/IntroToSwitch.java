package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {
		
		
		// given number 1-7, print out the name of the day
		
		int day = 7;
		String dayName;
		
		if (day==1)
		{
	//		System.out.println("monday");
		dayName = "Monday";
		}
		
		else if (day==2)
		{
	//	System.out.println("Tuesday");
		dayName = "Tuesday";
		}
		
		else if (day==3)
		{
	//		System.out.println("Wednestay");	
		dayName = "Wednesday";
		}
		
		else if (day==4)
		{
	//		System.out.println("thursday");
		dayName = "Thursday";
		}
		
		else if (day==5)
		{
	//		System.out.println("friday");
		dayName = "Friday";
		}

		else if (day ==6)
		{
	//		System.out.println("saturday");
		dayName = "Saturday";
		}
		
		else if (day==7)
		{
	//		System.out.println("sunday");
		dayName = "Sunday";
		}
		
		else {
	// System.out.println("not day");
		dayName = "Not a day";
		
		}
		
		System.out.println("Today is " + dayName);
		
		// switch case-------------------------
		
		
		switch (day)
		{
		case 1:
	//		System.out.println("Monday");
			dayName = "Monday";
			break;
			
		case 2:
	//		System.out.println("Tuesday");
			dayName = "Tuesday";
		break;														// ends the execution of the block. 
																	// if there is no break it will run all code until finding a break				
		case 3:
	//		System.out.println("Wednesday");
			dayName = "Wednesday";
		break;
		
		case 4:
	//		System.out.println("Thursday");
			dayName = "Thursday";
		break;
		
		case 5:
	//		System.out.println("Friday");
			dayName = "Friday";
		break;
		
		case 6:
	//		System.out.println("Saturday");
			dayName = "Saturday";
			break;
			
		case 7:
	//		System.out.println("Sunday");
			dayName = "Sunday";
			break;
			
			default:                  // default is same as "else" in if condition
	//			System.out.println("Not a day");
				dayName = "Invalid Day";
				break;}
		System.out.println("Day with number " + day + " is " + dayName);
		
		
		

	}

}

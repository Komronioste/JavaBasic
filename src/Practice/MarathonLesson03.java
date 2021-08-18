package Practice;

public class MarathonLesson03 {

	public static void main(String[] args) {
		
		
		String name = "Komron";
		String lastName = "Babakhanzoda";
		char grade = 'B';
		String city = "Falls Church";
		String state = "VA";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
		city = "Alexandria";
		state = "Virginia";
		long phoneNumber = 7033034630l;
		grade = 'A';
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		System.out.println("------------------------------------");
		
		int num1 = 35;
		int num2 = 20;
		int sum;
		sum = num1+num2;
		System.out.println(sum);
		
		
		int c = 32;
		int f = 9*c/5+32;
		
		System.out.println(f);
		
		
		double km = 15;
		double mile = km*1.609344;
		
		System.out.println(mile);
		
		
		double r = 5.5;
		double perimeter = 2 * r * Math.PI;
		double area = r * r * Math.PI; 
	
		System.out.println(perimeter);
		System.out.println(area);
		
		int num3 = 4;
		int num4 = 7;
		int num5 = 10;
		int ave = (num3+num4+num5)/3;
		
		System.out.println("average is " + ave);
		
		int width = 5;
		int height = 8;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + (2*(height+width)) + ".");
		
		int increase = 10;
		increase +=15;
		System.out.println(increase);
		
		int decrease = 100;
		decrease -=67;
		System.out.println(decrease);
		
		double cakePiece = 11;
		cakePiece /=4;
		System.out.println(cakePiece);
		
		double cakePieces = 25;
		cakePieces %=7;
		System.out.println(cakePieces);
		
		System.out.println("-------------------------------");
		//lesson04
		
		int time = 11;
		
		if ( time < 12 && time >6)
		{
			System.out.println("Good morning");
		}
		else if (time >= 12 && time <15)
		{
			System.out.println("good afternoon");
		}
		else if (time >= 15)
		{
			System.out.println("Good Evening");
		}
		else
		{
			System.out.println("Wrong time");
		}
		
		
		int temp = 22;
		
		if (temp <32)
		{
			System.out.println("Water will freeze with temperature " + temp + ".");
		}
		else 
		{
			System.out.println("Water will NOT freeze with temperature " + temp + ".");
		}
		
		System.out.println("----------------------------");
		//lesson 05
		
		boolean allergy = true;
		boolean peanutAllergy = true;
		boolean lactoseAllergy = false;
		boolean beeAllergy = true;
		boolean seafoodAllergy = false;
		
		if(allergy) 
		{
		if (peanutAllergy)
		{System.out.println("Dont eat peanuts");}
		if (lactoseAllergy)
		{System.out.println("Don't drink milk");}
		if (beeAllergy)
		{System.out.println("Dont eat honey");}
		if (seafoodAllergy)
		{System.out.println("Dont eat seafood");}
		}
		else
		{System.out.println("You are healthy");}
		
		
		
		
		boolean itsFriday = true;
		int date = 14;
		
		if (itsFriday)
		{
			System.out.println("I am goint to watch a movie");
			if(date==13)
			{System.out.println("I will watch scary movie");}
			else { System.out.println("I will watch comedy");}
		}
			else {System.out.println("I will study JAVA");}
		
		
		int hr = 15;
		if (hr < 12)
		{System.out.println("Good morning");}
		else if (hr>=12 && hr<15)
		{System.out.println("Good afternoon");}
		else if (hr >=15)
		{System.out.println("Good evening");}
		
		
		int eOo = 16;
		if (eOo%2==0)
			{System.out.println("Number is even");}
		else 
		{ System.out.println("number is odd");}
		
		
		
	}

}

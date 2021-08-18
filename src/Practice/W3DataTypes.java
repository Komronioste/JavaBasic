package Practice;

import java.util.Scanner;

public class W3DataTypes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		
		System.out.println("Please enter temperature in F");
		double f = scan.nextDouble();
		double c;
		
		System.out.println(f + " degree Fahrenheit is equal to " + ((f-32)*5/9) + " in Celsius degree");
		
		
		//2.  Write a Java program that reads a number in inches, converts it to meters.
		
		System.out.println("Please enter number of inches");
		double inch = scan.nextDouble();
		double meter = inch*0.0254;
		System.out.println(inch + " inches are equal to " + meter + " meters");
		
		//3. Write a Java program that reads an integer between 0 and 1000 
		//and adds all the digits in the integer.
		
			
		//logic to do this is to identify each digit. finding remainder using modulus will 
		//help us identifying last digit...
		
		System.out.print("Input an integer between 0 and 1000: ");
        int num = scan.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
        
        
        //4.Write a Java program to convert minutes into a number of years and days.
        
        System.out.println("Please enter number of minutes");
		int min = scan.nextInt();
		
		int day = min/60/24;  //first we convert minutes into days, then divide days into years and find remainder.
		
		int year = day/365;
		
		int remainder = day%365;
		
		
		System.out.println(min + " minutes is approximately " + year + " years and " + remainder + " days!");
	
		//5.
		
		//6. Write a Java program to compute body mass index (BMI).
		
		System.out.println("What is your weight in pounds?");
		double lb = scan.nextDouble();
		System.out.println("What is your height");
		double in = scan.nextDouble();
		
		double bmi = lb/(in*in)*705;
		
		System.out.println("Body Mass Index is " + bmi);
		
	
	
	
	 //8.Write a Java program that reads a number and display the square, cube, and fourth power.
		
		System.out.println("Please enter a number");
		int num3 = scan.nextInt();
		System.out.println("Square: " + (num3 * num3));
		System.out.println("Cube: " + (num3*num3*num3));
		System.out.println("Fourth power: " + (Math.pow(num3, 4)));
		
	//9. Write a Java program that accepts two integers from the user 
	//	and then prints the sum, the difference, the product, the average, 
		//the distance (the difference between integer), the maximum (the larger of the two integers),
		//the minimum (smaller of the two integers).
		
		System.out.println("Please enter first number");
		int n1 = scan.nextInt();
		System.out.println("Please enter second number");
		int n2 = scan.nextInt();
		
		System.out.println("Sum of two numbers: " + (n1+n2));
		System.out.println("Difference of two numbers: " + (n1-n2));
		System.out.println("Product of two numbers: " + (n1*n2));
		System.out.println("Average of two numbers: " + ((double)(n1+n2)/2));
		System.out.println("The larger number is: " + Math.max(n1, n2));
		System.out.println("The lesser number is: " + Math.min(n1, n2));
		
		//10. Write a Java program to break an integer into a sequence of individual digits.
		
		System.out.println("Please enter six-digit number");
		int n3 = scan.nextInt();
		
		int numb1 = n3/100000%10;
		int numb2 = n3/10000&10;
		int numb3 = n3/1000%10;
		int numb4 = n3/100%10;
		int numb5 = n3/10%10;
		int numb6 = n3 % 10;
		
		System.out.println(numb1 + " " + numb2 + " " + numb3 + " " + numb4 + " " + numb5 + " " + numb6 );
		
		//11...
		
		
		
		
	
	
	}

}

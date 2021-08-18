package Practice;

import java.util.Scanner;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			num++;
			System.out.print(num + " ");
		}

		System.out.println();
		int num1 = 100;
		
		for (int i = 100; i >=1; i--)
		{
			System.out.print(num1 + " ");
			num1--;
			
		}
		System.out.println();
		
		int num2 = 20;
		for (int i = 20; i >=1; i--)
		{
			
			if (num2%2==0)
			{
				System.out.print(num2 + " " );
			}
			num2--;
			
		}
		
		System.out.println();
		
	int	num3 = 20;
	for ( int i = 20; i <=50; i++)
	{
		if (num3%2!=0)
		{
			System.out.print(num3 + " ");
				}
		num3++;
	}
	
	System.out.println();
		
	System.out.println("Enter a positive integer");
	int n = scan.nextInt();
	int m = 1;
	for ( int  i = 1; i <=10; i++)
	{
		System.out.println(n + " * " +  m + " = " + (n*m));
		
		m++;
	}
	
	
	System.out.println();

	
	int number = 1;
	
	for ( int i = 1; i <= 50; i++)
	{
		if (number%3==0)
		{
			System.out.print(number + " ");
		}
		number++;
	}
	
	System.out.println();

	
	for ( int i =0; i<10; i++)
	{
		System.out.println("Would you like a credit card???");
		String answer = scan.next();
		
		if (answer.equalsIgnoreCase("yes"))
		break;
	}
	
	System.out.println("Yay");
	
	System.out.println();
	
	int even = 0;
	int odd = 0;

	System.out.println("Enter first");
	int	first = scan.nextInt();
	System.out.println("Enter second number");
	int second = scan.nextInt();
	
	for ( int i = first; i <= second; i++ )
	{
	
		if (i%2==0)
		{
			even+=i;
		}
		else {odd+=i;}
		
	}
	System.out.println("even: " + even);
	System.out.println("odd: " + odd);
	
	System.out.println();
	
	System.out.println("What you wanna buy?");
	String product = scan.next();
	System.out.println("What's the price?");
	int price = scan.nextInt();
	
	while (price > 0)
	{
		System.out.println("How much more would you like to pay?");
		int payment = scan.nextInt();
		System.out.println("Remaining balance is: " + (price - payment));
		price -=payment;
	}
	if ( price < 0)
	{
		System.out.println("You can have " + Math.abs(price)  + " back");
	}
		
	System.out.println("Congrats, you paid off");
	
	
		
	}

}

package Practice;

import java.util.Scanner;

public class Homework0605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which week of the day it is?");
		
		int date = scan.nextInt();
		
		if (date == 6 || date == 7) 
		{
			System.out.println("It is a weekend!");
		}
		
		else if (date<6)
		{
			System.out.println("It is a weekday!");
		}
			
		else
		{
			System.out.println("Invalid Day!");
		}
	}

}

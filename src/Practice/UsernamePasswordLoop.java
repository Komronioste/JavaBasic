package Practice;

import java.util.Scanner;

public class UsernamePasswordLoop {

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		// 2. Write a program that asks user to enter his/her username and password until user enters them correctly.

		String pass;
		String user;
		
		System.out.println("Please enter your username");
		user = scan.next();
		
		System.out.println("Please enter your password");
		pass = scan.next();
		
		if (pass.equals("neotech") && user.equalsIgnoreCase("ahmet"))
			
		{
			System.out.println("Welcome");
			}
		
		else if (!pass.equals("neotech") || !user.equals("ahmet")) {
			
			while (!pass.equals("neotech") || !user.equals("ahmet"))
			{System.out.println("Please, try your login and password again");
			System.out.println("Enter your username first");
			user = scan.next();
			System.out.println("Enter your password");
			pass = scan.next();
		
			if (pass.equals("neotech") && user.equalsIgnoreCase("ahmet")) 
		{  
			System.out.println("WELCOME");
		}
			
		}
		}
			
		}
	
	
}

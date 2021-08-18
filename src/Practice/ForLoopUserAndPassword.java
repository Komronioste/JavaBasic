package Practice;

import java.util.Scanner;

public class ForLoopUserAndPassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your username");
		String user = scan.next();
		
		System.out.println("Enter your password");
		String pw = scan.next();
		
		if ( user.equalsIgnoreCase("kombo") && pw.equals("123"))
		{
			System.out.println("Welcome");
		}
		else  {
			
			while (!user.equalsIgnoreCase("kombo") || !pw.equals("123"))
			
			{System.out.println("Oops! Please type your user name again");
		 user = scan.next();
		 System.out.println("Please type your password name again");
		 pw = scan.next();
			}
			System.out.println("Hooray");
		}
	}

}


// Enter your user
// scanner
// Enter your pw
// scanner
// if correct
//			- welcome
// if wrong 
//			- try again
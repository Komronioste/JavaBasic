package Practice;

import java.util.Scanner;

public class MethodsPractice {

	public static void main(String[] args) {
		
		
	 Scanner scan = new Scanner (System.in);
	 
	

	 
	 System.out.println("Enter your username");
		String un = scan.next();
		 
	 System.out.println("Please enter your password.");
	 	 String pw = scan.next();
	 	 
	 System.out.println("Please confirm your password");
	 	 String pwConf = scan.next();
	 

	 	while(!pw.equals(pwConf) || pw.isEmpty() || pw.length()<5 || pw.contains(un))
			
	 	{		
			
	 if (pw.isEmpty())
	 {
		 System.out.println("Password cannot be empty.");
	 }
	 
	if (pw.length()<5)
	 {
		 System.out.println("Password too short");
	 }
	 
	if (pw.contains(un))
	 {
		 System.out.println("Password cannot contain username");
	 }
	 else if (!pw.equals(pwConf))
	 {
		 System.out.println("Retry again");
	 }
	
	 
	 System.out.println("Enter your username");
	 un = scan.next();
	 
	 System.out.println("Please enter your password.");
	 pw = scan.next();
  
	 System.out.println("Please confirm your password");
 	 pwConf = scan.next();
	
	 
	 	}
	
	
		System.out.println("Welcome");
		
		
		String sunday = "Sunday";
		for
		(int i = sunday.length()-1; i>=0; i--)
		{
			System.out.print(sunday.charAt(i));
		}
		
		System.out.println();
		
		String str = "Bubblee";
		System.out.println (str.charAt(str.length()/2));
	}

}

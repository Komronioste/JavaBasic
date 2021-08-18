package Practice;

import java.util.Scanner;

public class BroDoWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String name = "";
		
		do {												// always executes block of code once then checks for while condition, if true, keeps running, if false - stops.
			System.out.println("Enter your name: ");
			 name = scan.nextLine();
			
		}
		while ( name.isBlank());
		System.out.println("Hello, " + name);
	}

}

package Practice;

import java.util.Scanner;

public class BroWhileLoops {

	public static void main(String[] args) {
		
		
		// while loop = executes block of code as long as its condition remains true
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		
		while (name.isBlank())
		{
			System.out.print("Enter your name");
			name = scan.nextLine();
		}
		
		System.out.println("Hello " + name);
		

	}

}

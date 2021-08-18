package Practice;

import java.util.Scanner;

public class Scannnnnnnner {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Your age?");
		int age = scan.nextInt();
		
		
		
		System.out.println("Your favorite food?");
		String food = scan.next();
		
		System.out.println("your name is " + name + " and you are " + age + " years old" );
		
	}

}

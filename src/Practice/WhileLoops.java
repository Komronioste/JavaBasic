package Practice;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		
		
		
		do{

			System.out.println("Enter your name: "); 
			name = scan.nextLine();
		}
		while(name.isBlank()); 
		
		System.out.println("Hello " +name);
		

	}

}

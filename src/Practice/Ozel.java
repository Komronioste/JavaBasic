package Practice;

import java.util.Scanner;

public class Ozel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner (System.in);
		String input;
		
		for (int a=0; a<=10; a++) {
			
			System.out.println("Do you wanna credit card"); 
			input=scan.next();
			
			if(input.equalsIgnoreCase("Yes") ) {
				System.out.println("Great");
				break;
			}else if (input.equalsIgnoreCase("no")) {
				System.out.println("Are you Sure");
				input=scan.next();
				
				if(input.equalsIgnoreCase("yes")) {
					System.out.println("Thats fine");
					
					
			
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}

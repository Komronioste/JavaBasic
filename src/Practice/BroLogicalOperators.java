package Practice;

import java.util.Scanner;

public class BroLogicalOperators {

	public static void main(String[] args) {
	
		
		// && - both conditions must be true
		// || - either condition must be true
		// ! - reverses boolean value of condition
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("You are playing a game! Press Q or q to quit");
		String response = scan.next();
		
		if (!response.equals("q") && !response.equals("Q"))   //preced boolean value with ! (not) to reverse boolean value.
		{
			System.out.println("You still playing");
			
		
		}
		else 
		{
			System.out.println("You quit the game");
		}
	}

}

package Practice;

import java.util.Scanner;

public class Homework0603 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Where do you live?");
		
		String city = scan.next();
		
		System.out.println("What is the weather?");
		
		int temp = scan.nextInt();
		
		temp = ((temp-32)*5/9);
		
		System.out.println("Weather in " + city + " is " + temp + " celcius!");
		
		System.out.println(100/32);
		
	}
}

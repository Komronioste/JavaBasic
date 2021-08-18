package Practice;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class MathInJava {

	public static void main(String[] args) {
		
		
		
		
		double x;
		double y;
		
		double z;  
		
		
		// Math.max(x,y); shows the larger of two
												// Math.min(x,y); shows the lesser of two	
												// Math.abs(y); shows absolute value
												// Math.sqrt(y); shows square root of y
												//Math.round(x); rounds to closest whole number
												// Math.ceil(x); rounds up
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
	}

}

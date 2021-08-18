package Practice;

public class Lesson3 {
	
	public static void main(String[] args) {
		
		
		//Basic String Practice
		
		String name = "Komron";
		String grade = "A";
		String state = "VA";
		
		System.out.println("My name is " + name);
		System.out.println(grade + " is my grade!");		
		System.out.println("I live in " +state);
		
		name = "Zarina";
		grade = "B";
		state = "CO";
		
		System.out.println();
		
		System.out.println("My name is " + name);
		System.out.println(grade + " is my grade!");		
		System.out.println("I live in " +state);
		
		System.out.println();
		System.out.println("*****************************");
		System.out.println();
		
		
		// Sum of two numbers practice
		int num1 = 10;
		int num2 = 20;
		int sum = num1+num2;
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum + " !");
		
		System.out.println();
		
		//Convert F to C
		
		int c = 20;
		double f = (9*c)/5+32;
		
		System.out.println("It is " + f + " F outside!");
		
		System.out.println();
		
		//convert m to km
		
		int mile = 10;
		double km = mile * 1.609344;
		
		System.out.println("10 miles are equal to " + km + " km!");
		
		System.out.println();
		
		// area and perimeter of rectangle
		
		int w = 5;
		int h = 8;
		int area = w*h;
		int per;
		
		System.out.println("Area of " + w + " and " + 8 + " is " + area);
		System.out.println("Perimeter is " + (2*(w+h)) + " square feet.");
		
		
		
	}

}

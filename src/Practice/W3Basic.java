package Practice;

import java.util.Scanner;

public class W3Basic {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//1
		System.out.println("Hello \nKomron Babakhanzoda");
		
		//2
		System.out.println(74+36);
		
		//3
		System.out.println(50/3);
		
		//4
		System.out.println("a = " + (-5+(8*6)));
		
		System.out.println("b = " + ((55+9)%9));
		
		System.out.println("c = " + (20+(-3*5/8)));
		
		System.out.println("d = " + (5+15/3*2-8%3));

		//5
		int a =25;
		int b = 5;
		
		System.out.println(a*b);
		
		//6  (use scanner for int input)
		int c;
		int d;
		
		
		System.out.println("Please enter first number");
		c=scan.nextInt();
		System.out.println("Please enter second number");
		d=scan.nextInt();
		
		System.out.println(c + " + " + d + " = " + (c+d));
		System.out.println(c + " - " + d + " = " + (c-d));
		System.out.println(c + " * " + d + " = " + (c*d));
		System.out.println(c + " / " + d + " = " + (c/d));
		System.out.println(c + " mod " + d + " = " + (c%d));
		
		
		//7
		int e;
		
		System.out.println("Please enter a number");
		e = scan.nextInt();
		
		System.out.println(e + " x " + "1 " +  "= " + (e*1));
		System.out.println(e + " x " + "2 " +  "= " + (e*2));
		System.out.println(e + " x " + "3 " +  "= " + (e*3));
		System.out.println(e + " x " + "4 " +  "= " + (e*4));
		System.out.println(e + " x " + "5 " +  "= " + (e*5));
		System.out.println(e + " x " + "6 " +  "= " + (e*6));
		System.out.println(e + " x " + "7 " +  "= " + (e*7));
		System.out.println(e + " x " + "8 " +  "= " + (e*8));
		System.out.println(e + " x " + "9 " +  "= " + (e*9));
		System.out.println(e + " x " + "10 " +  "= " + (e*10));
		
						// OR use a for loop
		
		System.out.println("Please enter a number");
		int num = scan.nextInt();
	
		for (int f = 0; f<10; f++)
			
		{
			System.out.println(num + " * " + (f+1) + " = " + (num*(f+1)));
		
		}
		
		//8   (use space between letters instead of tab)*
		
		System.out.println("    J     a  	v     v     a");
		System.out.println("    J    a a   	 v   v     a a");
		System.out.println(" J  J   aaaaa  	  v v     aaaaa");
		System.out.println("  JJ   a     a 	   v     a     a");
		
		//9  ( if run without declaring variables, result will be with decimals )
		System.out.println(((25.5*3.5-3.5*3.5)/(40.5-4.5)));
		
		//10
		System.out.println(4.0*(1-(1.0/3) + (1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
		
		//11   Math.PI gives us the value of pi
		
		double radius = 7.5;
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Area is equal to " + area);
		System.out.println("Perimeter is equal to " + perimeter);
		
		//12
		System.out.println("Please enter 3 numbers");
		double g = scan.nextDouble();
		double h = scan.nextDouble();
		double i = scan.nextDouble();
		System.out.println("The average is " + ((g+h+i)/3));
					
		//13
		double width = 5.6;
		double height = 8.5;
		
		System.out.println("Area is " + width + " * " + height + " = " + width*height);
		System.out.println("Perimeter is 2 * (" + width + " + " + height  + " ) = " + (2*(height+width)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

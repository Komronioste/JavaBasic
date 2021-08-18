package com.neotech.lesson04;

public class Recap {
	
	public static void main(String[] args) {
		
		// order of arithmetic operations
		
	int num1 = 10+10*10;
	System.out.println(num1);
	
	int num2 = (10+10)*10;
	System.out.println(num2);
	
	int num3 = 10*10+10/10;
	System.out.println(num3);
	
	int num4 = 15;
	int num5 = 4;
	int div = num4/num5;
	System.out.println("div is  " + div); // it will print 3 instead of 3.75. 0.75 is lost because int cannot store decimals.
	int rem = num4 % num5;
	System.out.println("rem is  " + rem);
	
	int remainder = 19%6;
	System.out.println("remainder is  " +remainder);
	
	int rem3 = 8%4;
	System.out.println("rem3 is   " + rem3);
	
	System.out.println();
	System.out.println("Addition vs Cocatenation");
	
	
	int a = 10;
	int b = 20;
	String x = "Java";
	String y = "Sunday";
	boolean z = true;
	
System.out.println(x + " " + y); // will print Java Sunday. to have space between words, need to add " " string with space in it.

System.out.println(x + y + a); //JavaSunday10
	
	System.out.println(x+z); // Javatrue
	System.out.println(a+b); // 30
	System.out.println(x+y+a+b); //JavaSunday1020 because string + number is a string
	System.out.println(a+b+x+y); // since it's number + number then + string, addition processes.
	System.out.println(x+y+a*b); //JavaSunday200 because you do multiplication first then addition from left to write just like in math.
	System.out.println();	
	
	String emptyStr = ""; // zero characters inside
	String spaceStr = " "; // one character inside, which is space
	}

}

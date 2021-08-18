package com.neotech.lesson03;

public class Lesson03Tasks {
	
	public static void main(String[] args) {
		
		
		//Write a Java program that will print a sum of two numbers Please use variables to store num1,num2,and sum.
		
		int num1, num2, sum;
		num1 = 2;
		num2 = 5;
		sum = num1+num2;
		System.out.println(sum);
		
		
		//Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32
		
		int C = 20; 
		int F = 9 * C/5 +32;
		
		System.out.println("20 Celcius is equal to " + F + " Fahrenheit.");
		
		
		//Write a Java program that converts mile to km 1 mile = 1.609344 km
		
		double mile = 1.609344;
		double km = 1;
		km = km*mile;
		
		System.out.println("We can tell that 1 mile is equal to " + mile + " killometers!");
	
		System.out.println("And 5 miles are equal to " + (mile*5) + " killometers!");
		
		//Program that calculates average of 3 numbers. 
		
		double n1 = 5;
		double n2 = 7;
		double n3 = 8;
		
		double average = (n1+n2+n3)/3;
		
		System.out.println(average);
		
		
		
		
	}

}

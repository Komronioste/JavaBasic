package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

Scanner scan = new Scanner (System.in);
int num;

 System.out.println("Please guess the number"); 
	num = scan.nextInt();


while (num !=7)
 {
	System.out.println("Please guess the number");
	num = scan.nextInt();

 }

System.out.println("You are winner");


}
}

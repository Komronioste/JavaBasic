package com.neotech.lesson15;

import java.util.Scanner;

public class Students {


	
	 char getGrade (int a)
	{ char grade = 0;
		if (a>90)
		{
		grade = 'A';
		}
		else	if (a>80 && a<=90)
		{
		grade = 'B';
		}
		else if (a>70 && a <= 80)
		{
		grade = 'C';
		}
		else if (a>60 && a<=70)
		{
		grade = 'D';
		}
		else { grade = 'F';}
		
		
		return grade;
	}
	
	 public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
		 
		 Students Komron = new Students();
		 Students Shodmon = new Students();
		
		 System.out.println("Enter Komron's score");
		 
		char score = Komron.getGrade(scan.nextInt());
		 System.out.println("Komron's score " + score);
		 
		 System.out.println("Enter Shodmon's grade");
		 score = Shodmon.getGrade(scan.nextInt());
		 System.out.println("Shodmon's score " + score);
		
		
		 
	}
	
}

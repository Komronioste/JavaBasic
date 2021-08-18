package com.neotech.lesson12;

public class Homework01 {
	
	public static void main(String[] args) {
		
	//Homework01
		
		String[][] names = {{"Mr", "Mrs", "Ms", "Miss"}, {"Smith", "Jordan", "Jackson", "Obama"}};
		
		
	
		for (int i = 0; i<names[0].length; i++)
		{
			System.out.println(names[names.length-1][i]);

			if (names.equals("Mrs"))
			{System.out.println("Mrs Smith");}
			
			
					}
		
		System.out.println(names[0][0]+ " " + names[1][3]);
		System.out.println(names[0][1]+ " " + names[1][0]);
		System.out.println(names[0][2]+ " " + names[1][2]);
		System.out.println(names[0][3]+ " " + names[1][1]);
	
	
		
		
		
	}
		
		}

package com.neotech.lesson17;

public class OldHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "I thought we just went over it two days ago.";
		String str2 = str.replaceAll(" ", "");
		
		System.out.println("old " + str);
		System.out.println("new " + str2);  //will print without spaces
	}

}

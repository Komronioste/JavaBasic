package com.neotech.lesson17;

public class Homework02 {

	public static void main(String[] args) {
		
		String today = "Today is Tuesday and we have a Java Class!!!";
		String[] split = today.split(" ");
		char[] chars = null;
		char [][] mainArray = null;
		

		
		for (int i = 0; i < split.length; i++)
		{
		 mainArray = new char[split.length][split[i].length()];
		}
		
		for (int i = 0; i < split.length; i++)
		{
		//	chars = split[i].toCharArray();
			for (int j = 0; j < split[i].length(); j++)
			{
			//	mainArray[i][j] = split[i].toCharArray();
			}
		}
	System.out.println(chars);

}
}


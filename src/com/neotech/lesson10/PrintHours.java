package com.neotech.lesson10;

public class PrintHours {

	public static void main(String[] args) {
		
		
		
		// print the whole combination of digital clock

		for (int i = 0; i<24; i++)
			
		{
			
			for (int j = 0; j<60; j++)
			{
		//		System.out.println(i+ ":" + j);
				
				//formatting the output to 00:01 instead of 00:1
				// we need to make 0:0 ==> 00:00
				
				if (i<10 && j<10)
				{
					System.out.println("0"+i+":0"+j);
				
				}
				
				else if (i>=10 && j<10)
				{	System.out.println(i+ ":0" + j); }
				
				else if (i<10 && j >=10)
				{
					System.out.println("0"+i+":"+j);
				}
				else
				{
					System.out.println(i+":"+j);
				}
			}
			
		}
			
			
			
			
			
			
			
	}

}

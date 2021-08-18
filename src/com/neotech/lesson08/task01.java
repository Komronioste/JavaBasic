package com.neotech.lesson08;

public class task01 {
public static void main(String[] args) {
	
	
	
	
	
	// print I need a day off as long it is a work day. once day 6 print i dont need work day
	
	boolean workDay = true;
	int day = 1;
	
	while (workDay)
		
	{
		if (day < 6)
	{		
			System.out.println("I need a day off");
	
	}
		else
	{
			System.out.println("I don't need a day off anymore");
			workDay = false;
	}
	
		day++;
	
	
	
	
}

}
}

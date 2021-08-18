package com.neotech.lesson33;

public class ExceptionIntro {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
//		System.out.println(a/b);   // ArithmeticException - divide by 0 gives an error
		
		int[] arr = {1,3,5,6};
		
//		System.out.println(arr[5]); //ArrayIndexOutOfBoundException - no such index in the array
		
		String hello = "hello";
		
//		System.out.println(str.length());
		
		
		try
		{
			
			char c = hello.charAt(15);
			System.out.println(c);
			
			// inner try - catch (nested)
//			try 
//			{
//				
//			}
//			
//			catch()
//			{
//				
//			}
			
			
			
		}
		
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());  
		}
		
		
		int c =10;
		int d = 0;
		
		try
		{
			System.out.println(c/d);
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by 0");
		}
		
		
	}

}

package com.neotech.lesson18;

public class LocalVariables {
	
	
	void method1()
	{	// these local variables only visible within their scope, in this case method1().
		String name = "Sabah";
		int age = 30;
		System.out.println(name);
	}
	
	void method2()
	{
		String name = "Komron";
	}

	//////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		
		
		LocalVariables obj = new LocalVariables();
		
		obj.method1(); // will do nothing
		
		System.out.println();
		
		boolean flag = true;    //scope of this variable is the main() method
		 if (flag)
		 {
			 String answer = "yes";  // scope of this variable is only in this if condition
			 System.out.println(answer);
			 System.out.println(flag);
		 }
		 System.out.println(flag);
		
	}
	
}

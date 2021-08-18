package com.neotech.lesson23;

 public  class FinalExample {
	
	final String str = "I Love Java!!";

	final void printVariable()
	{
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		FinalExample fn = new FinalExample();
		
		fn.printVariable();
		
		String bc = fn.str.replaceAll("[A-Z]", "*");
		System.out.println(bc);
		
		
	}
}

class ChildClass extends FinalExample
{
	String str = "Child Class";
	
	
}
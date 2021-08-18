package com.neotech.lesson18;

public class InstanceVariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceVariables obj = new InstanceVariables();
		
		System.out.println(obj.name);
		
		InstanceVariables obj1 = new InstanceVariables();
		obj1.name = "Evis";
		System.out.println(obj1.name);  //we changed one instance of the name variable.
		
	
		
		
	}

}

package com.neotech.lesson22;

public class State {

	//instance variables
	
	String name, capital;
	
	public State(String name, String capital)
	{
		this.name=name;
		this.capital=capital;
	}
	
	public void displayName()
	{
		System.out.println(name);  //compiler will assume there is this. keyword in there
	}
	
	public void displayFull()
	{
		this.displayName();
		this.displayCapital();   //we can use methods to call other methods
	}
	
	public void displayCapital()
	{
		System.out.println(capital);
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		
		State st = new State("NJ", "Trenton");
		
		st.displayCapital();
		st.displayName();
		st.staticMethod();
		st.displayFull();
		
		
		
	}
	
}

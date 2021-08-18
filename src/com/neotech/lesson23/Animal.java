package com.neotech.lesson23;

public class Animal {
	
	int a = 23333333;
	public void eat()
	{
		System.out.println("Anima eats");
	}
	
	public void sleep()
	{
		System.out.println("Animal sleeps");
	}
	
	public void cry()
	{
		System.out.println("Animals dont cry");
	}
	
	
}

class Tiger extends Animal
{
	int a = 33;
	public void eat()
	{
		System.out.println("Tiger eats a lot");
	}
	
	public void sleep()
	{
		System.out.println("Tiger sleeps a lot");
	}
	
	public void run()
	{
		System.out.println("Tiger runs fast");
	}
}

class Cub extends Tiger{
	
}

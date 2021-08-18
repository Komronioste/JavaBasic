package com.neotech.lesson23;

public class Computer {
	
	public void beingReliable()
	{
		System.out.println("Computers are reliable");
	}
	
	public void makeNoise()
	{
		System.out.println("Computers make a lot of noise");
	}
	
	public void cost ()
	{
		System.out.println("Computer have varying prices");
	}
	
	public static void main(String[] args) {
		
		Computer pc1 = new Computer();
		Computer pc2 = new Apple();
		Computer pc3 = new Lenovo();
		Computer pc4 = new HP();
		Computer pc5 = new Dell();
		
		Computer[] pc = new Computer[5];
		pc[0] = pc1;
		pc[1] = pc2;
		pc[2] = pc3;
		pc[3] = pc4;
		pc[4] = pc5;
		
		for (Computer abc : pc)
		{
			abc.makeNoise();
			abc.beingReliable();
			abc.cost();
		}
	}

}


class Apple extends Computer {
	
	public void makeNoise()
	{
		System.out.println("Apple does not make noise");
	}
	
	public void cost ()
	{
		System.out.println("Apple are super expensive");
	}
	
}

class Lenovo extends Computer {
	
	public void cost ()
	{
		System.out.println("Lenovo are affordable");
	}
	
}

class HP extends Computer {
	
	public void cost ()
	{
		System.out.println("HP cost around 700$");
	}
	public void beingReliable()
	{
		System.out.println("HP is UNreliable");
	}
	
}

class Dell extends Computer {
	
	public void makeNoise()
	{
		System.out.println("Dell is super noisyyyyy");
	}
	
}
package com.neotech.lesson23;

public class WebDriver {
	
	int a = 10;
	
	public void open()
	{
		System.out.println("Open Browser");
	}

}

class ChromeDriver extends WebDriver
{
	int a = 11;
	int b = 12;
	public void open()
	{
		System.out.println("Open Chrome Browser");
	}
}

class FirefoxDriver extends WebDriver
{
	public void open()
	{
		System.out.println("Open Firefox Browser");
	}
}
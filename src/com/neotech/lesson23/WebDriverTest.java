package com.neotech.lesson23;

public class WebDriverTest {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.open();
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.open();
		
		System.out.println(driver.a);

	}

}

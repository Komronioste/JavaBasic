package com.neotech.lesson24;

import java.util.Arrays;

public class Browsers {


	
	
	
	public static void main(String[] args) {
		
		
		WebDriver wd1 = new ChromeDriver("Chrome V 1.0");
		
		WebDriver wd2 = new FirefoxDriver("Ffx v 1.0");
		
		wd1.closeBrowser();
		wd1.findElement();
		wd1.maximizeWindow();
		wd1.openBrowser();
		wd1.takePicture();
		
		wd2.closeBrowser();
		wd2.findElement();
		wd2.maximizeWindow();
		wd2.openBrowser();
		wd2.takePicture();
		
	

	}

}

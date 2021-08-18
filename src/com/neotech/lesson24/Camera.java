package com.neotech.lesson24;

public interface Camera {

	void takePicture();
	
	
}

class ChromeDriver  implements Camera, WebDriver {

	String name;
	
	ChromeDriver(String name) {
		this.name=name;
	}
	


	@Override
	public void openBrowser() {
		
		System.out.println(name + " ChromeDriver implements openBrowser from Camera & WebDriver");
		
	}

	@Override
	public void closeBrowser() {

		System.out.println(name +" ChromeDriver implements closeBrowser from WebDriver");
		
	}

	@Override
	public void maximizeWindow() {

		System.out.println( name+ " ChromeDriver implements maximizeWindow from WebDriver");
		
	}

	@Override
	public void findElement() {

		System.out.println(name + " ChromeDriver implements findElement from WebDriver");
		
	}

	@Override
	public void takePicture() {
		
		System.out.println(name + " ChromeDriver implements takePictures from Camera");
		
	}
	
}

class FirefoxDriver implements Camera, WebDriver {

	String name;
	FirefoxDriver(String name) {
		this.name=name;
		
	}

	@Override
	public void openBrowser() {

		System.out.println(" Firefox implements openBrowser from WebDriver");

		
	}

	@Override
	public void closeBrowser() {

		System.out.println(" Firefox implements closeBrowser from WebDriver");

		
	}

	@Override
	public void maximizeWindow() {

		System.out.println(" Firefox implements maximizeBrowser from WebDriver");

		
	}

	@Override
	public void findElement() {


		System.out.println(" Firefox implements findElement from WebDriver");

		
	}

	@Override
	public void takePicture() {
		System.out.println(" Firefox implements takePicture from Camera");
		
	}
	
}





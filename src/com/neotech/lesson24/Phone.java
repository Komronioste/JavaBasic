package com.neotech.lesson24;

public abstract class Phone {

	public void call() {

	}

	public void text() {
		
	}
	
	abstract void takePicture();

	abstract void playMusic();
	
	abstract void playGames();

}

class iPhone extends Phone {
	
	
	@Override
	public void text() {
		System.out.println("You can talk on iPhone");
		
	}

	@Override
	void takePicture() {

		System.out.println("iPhone takes photos");

	}

	@Override
	void playMusic() {

		System.out.println("iPhone can play music!!");

	}
	
	public void playGames() {
		
	}
	

}

class Samsung extends Phone {

	@Override
	void takePicture() {
		System.out.println("Samsungs take nice pictures");
		
	}

	@Override
	void playMusic() {

		System.out.println("Samsung does NOT play music !!");
	}
	
	public void playGames() {
		System.out.println("Can play games");
	}
	
}
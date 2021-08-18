package com.neotech.lesson27;

public abstract class Insurance {
	
	 String insuranceName;
	
	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Vehicle extends Insurance {
	
	
	

	Vehicle(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		
	}

	String carModel;

	@Override
	public void getQuote() {
		
		System.out.println("15 minutes could save you 15% or more for " + carModel);
		
		
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("You want to cancel vehicle insurance for " + carModel);
		
	}
	
	}

	
	
	

class Pet extends Insurance {
	
	String petType;
	
	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
		
	}

	

	@Override
	public void getQuote() {

System.out.println("PedMed offers best plans for " + petType);
		
	}

	@Override
	public void cancelInsurance() {


		System.out.println("Dont you cancel on your " + petType);
		
	}


}

class Health extends Insurance {

	Health(String insuranceName) {
		super(insuranceName);
		


}

	@Override
	public void getQuote() {
		
		System.out.println("MedicAid is the most affordable");
		
		
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("You dont have to cancel medicaid");
	
		
	}
}

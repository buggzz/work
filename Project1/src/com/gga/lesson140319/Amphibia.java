package com.gga.lesson140319;

public class Amphibia implements LandVehicle, SeaVehicle {
	
	Car car = new Car();
	Boat boat = new Boat();
	
	@Override
	public void drive() {
		car.drive();
	}
	
	@Override
	public void sail() {
		boat.sail();
	}

}

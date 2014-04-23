package com.gga.lesson140319;

public class Hidroplan extends Boat implements AirVehicle {

	private Airoplane airoplane = new Airoplane();

	@Override
	public void sail() {
		System.out.println("my sail");
	}
	
	@Override
	public void fly() {
	    airoplane.fly();
	}

}

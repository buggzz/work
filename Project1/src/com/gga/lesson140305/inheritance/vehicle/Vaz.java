package com.gga.lesson140305.inheritance.vehicle;

public class Vaz extends Engine {
	
	@Override
	public void start() {
        System.out.println("VAZ engine start");
	}

	@Override
	public void stop() {
		System.out.println("VAZ engine stop");
    }

}

package com.gga.lesson140305.inheritance.vehicle;

public class Michelin extends Wheel {

	@Override
    public void makeSound() {
        System.out.println("woooooooooow");
		super.makeSound();
		System.out.println("wheeeeeeeelll");
    }

}

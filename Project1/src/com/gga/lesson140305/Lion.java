package com.gga.lesson140305;

public class Lion extends Animal{

	@Override
	public void makeSound() {
		System.out.println("RRrrrraaaaarrr");
	}

	@Override
	public void feed(String food) {
		if (food.equals("meat")) {
			System.out.println("murrrrr");
		} else {
			System.out.println("????????");
		}
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}

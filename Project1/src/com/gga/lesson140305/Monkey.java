package com.gga.lesson140305;

public class Monkey extends Animal{

	@Override
	public void makeSound() {
		System.out.println("wooop");
	}

	@Override
	public void feed(String food) {
		if (food.equals("banana")) {
			System.out.println("mmmmmm");
  	     } else {
			System.out.println("????????");
		}
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}

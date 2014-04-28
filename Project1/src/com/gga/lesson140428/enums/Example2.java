package com.gga.lesson140428.enums;

public class Example2 {

	enum Fruit {
		Apple(10), Pear(14), Carrat(100);
		
		private int price;
		
		Fruit(int price) {
			this.price = price;
		}
		
		int getPrie() {
			return price;
		}
	}
	
	public static void main(String[] args) {
		for (Fruit fruit : Fruit.values()) {
			System.out.println(fruit + " = " + fruit.getPrie() + ", ordinal = " + fruit.ordinal());
		}
	}

	
	
}

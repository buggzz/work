package com.gga.lesson140312.interfaces;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class TestDogs {

	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<Dog>();
		
		dogs.add( new Dog("Rex", 10, 20, 6));
		dogs.add( new Dog("Шарик", 5, 20, 5));
		dogs.add( new Dog("Бобик", 12, 21, 4));
		dogs.add( new Dog("Трезор", 12, 20, 4));
		
		Collections.sort(dogs);
		
		for (Dog dog : dogs) {
			System.out.println(dog.name + ": " + dog.speed +","+ dog.height + "," + dog.furQuality);
		}
	}

}

package com.gga.lesson140604;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gga.lesson140528.Utils;

public class StopExample {

	static class Car {
		String engine;
		String chassis;
		String[] wheels;
		
		public void mountEngine(String engine) {
			this.engine = engine;
		}
		
		public void mountChassis(String chassis) {
			this.chassis = chassis;
		}
		
		public void mountWheels(String[] wheels) {
			this.wheels = wheels;
		}
		
		@Override
		public String toString() {
			return engine + "," + chassis + "," + Arrays.toString(wheels);
		}
	}

	private static boolean stopped = false;
	
	public static void main(String[] args) {
		final List<Car> readyCar = new ArrayList<>();
		
		Thread carFactory = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!stopped) {
					Car car = new Car();
					readyCar.add(car);
					buildCar();
				}
				
			}
		});
		
		carFactory.start();
		Utils.pause(12000);
		stopped = true;
		
		for(Car car : readyCar) {
			System.out.println(car);
		}
		
	}
	
	public static Car buildCar() {
		Car car = new Car();
		car.mountEngine("M-300");
		car.mountChassis("C-20");
		car.mountWheels(new String[] {"left", "right", "back-left", "back-right"});
		return car;
	}

}

package com.gga.lesson140319;

public class UseVehicles {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Boat boat = new Boat();
		Amphibia amphibia = new Amphibia();
		Airoplane airoplane = new Airoplane();
		Hidroplan hidroplan = new Hidroplan();
		
		travelByLand(car);
		travelBySea(boat);
		travelByAir(airoplane);
		
		travelByLand(amphibia);
		travelBySea(amphibia);

		travelBySea(hidroplan);
		travelByAir(hidroplan);
	}

	private static void travelByAir(AirVehicle airVehicle) {
		airVehicle.fly();
	}

	private static void travelBySea(SeaVehicle seaVehicle) {
		seaVehicle.sail();
	}

	private static void travelByLand(LandVehicle landVehicle) {
		landVehicle.drive();
	}

}

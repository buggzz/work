package com.gga.lesson140224;

public class Switch2 {

	public static void main(String[] args) {
		char route[] = {'L', 'L', 'F', 'R', 'T', ',', 'F', 'S'};
		
		for (int i = 0; i < route.length; i++) {
			moveRobot(route[i]);
		}
		

	}

	private static void moveRobot(char moveCommand) {
        switch (moveCommand) {
		case 'L':
			System.out.println("move Left");
			break;
		case 'F':
			System.out.println("move Forward");
			break;
		case 'R':
			System.out.println("move Right");
			break;
		case 'S':
			System.out.println("Stopped");
			break;
		case 'T':
			System.out.println("Turned around");
			break;
		default:
			System.out.println("unknown command : " + moveCommand);
			break;
		}
		
	}

}

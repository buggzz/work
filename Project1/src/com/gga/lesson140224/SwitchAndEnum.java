package com.gga.lesson140224;

public class SwitchAndEnum {
    
    enum RobotCommands {Left, Right, Forward, TurnAround, Stop};
	
	public static void main(String[] args) {
        RobotCommands[] route = { RobotCommands.Left, RobotCommands.Right, RobotCommands.Right, RobotCommands.Stop};
        
        for (RobotCommands robotCommands : route) {
			perform(robotCommands);
		}

	}

	
	
	private static void perform(RobotCommands robotCommands) {
		switch (robotCommands) {
		case Left:
			System.out.println("Left");
			break;
		case Right:
			System.out.println("Right");
			break;
		case TurnAround:
			System.out.println("Turned");
			break;
		case Stop:
			System.out.println("Stop");
			break;
		default:
			break;
		}
	}
	
}

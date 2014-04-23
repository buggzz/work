package com.gga.lesson140414.reflection;

public class SimpleRobot implements Robot {

	@Override
	public void forward() {
        System.out.println("move forward");
	}

	@Override
	public void back() {
		System.out.println("move back");
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}

	@Override
	public void left() {
		System.out.println("move left");
	}

	@Override
	public void right() {
		System.out.println("move right");
	}

}

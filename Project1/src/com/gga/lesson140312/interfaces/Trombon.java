package com.gga.lesson140312.interfaces;

public class Trombon extends WindInstrument {

	@Override
	public void play() {
System.out.println(this.getClass().getName() + "plays : phuuu");
		
	}

	@Override
	public void crush() {
		System.out.println(this.getClass().getName() + " crush");		
		
	}

	@Override
	public void clean() {

		System.out.println(this.getClass().getName() + " clean");
	}

}

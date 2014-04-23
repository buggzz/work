package com.gga.lesson140331.innerlocal;

public class L {

	interface Changer {
		void change();
	}
	
	private int state;
	
	private void changeState() {
		state += 1;
	}
	
	public Changer getChanger(final int amount) {
		final int realAmount = amount % 10;
		
		class MyChanger implements Changer {
			@Override
			public void change() {
				state += realAmount;
				changeState();
			}
		}
		
		return new MyChanger();
	}
	
	public static void main(String[] args) {
		L l = new L();
		Changer changer = l.getChanger(12);
		changer.change();
		System.out.println(l.state);
	}
	
}

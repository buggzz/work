package com.gga.lesson140224;

public class Operations {

	public static void main(String[] args) {
		int a = 10 + 20 / 3 * 40 - 15;
		int b = a % 2;
		int c = b >> 4;
		int d = b << 2;
		int e = d & 0xff;
		int f = d | 0xFF;
		int g = d ^ 0xff;
		
		int q = 3;
		int w = 5;
		System.out.println("w = " + w);
		System.out.println("q = " + q + "\n");
		q = q ^ w;
		w = w ^ q;
		q = w ^ q;
		System.out.println("w = " + w);
		System.out.println("q = " + q);
	}

}

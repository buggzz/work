package com.gga.lesson140219;

public class Divider {

	public static void main(String[] args) {
		int result = div(100, 0);
		System.out.println(result);
	}

	private static int div (int i, int j) {
		if (j == 0) {
			return Integer.MAX_VALUE;
		}
		return i/j;
	}
}

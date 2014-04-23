package com.gga.lesson140407.exception;

public class UseFinallyAndReturn {

	public static void main(String[] args) {
		System.out.println(calculateSomething());

	}

	private static int calculateSomething() {
		int result = 0;
		try {
			result = 100 / 0;
			return result;
		} finally {
			return 10;
		}
	}

}

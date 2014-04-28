package com.gga.lesson140428.variable;

public class Examples {
     public static void main(String[] args) {
		int i = sum (1, 2);
		int j = sum (1, 2, 3);
	}

	private static int sum(int... j) {
		int sum = 0;
        for (int i : j) {
			sum +=i;
		}
		return sum;
	}
	
}

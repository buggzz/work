package com.gga.lesson140224;

public class Parameters {

	public static void main(String[] args) {
		int i = 20;
		process(i);
       System.out.println(i);
	}

	private static void process(int localI) {
        localI = localI + 2;
		System.out.println(localI);
	}

}

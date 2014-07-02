package com.gga.lesson140224;

public class E {

	public static void main(String[] args) {
		int a[] = { 10, 20, 40, -20, 40, 67 };
		
		int index = find(a, 40, 2);
		
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("found at position " + index);
		}
	}

	private static int find(int[] a2, int item, int count) {
		int found = -1;
		int foundCount = 0;
		for (int j = 0; j < a2.length; j++) {
			if (a2[j] == item) {
				foundCount++;
				if (foundCount != count) {
					continue;
				} else {
					found = j;
					break;
				}
			}
		}
		return found;
	}

}

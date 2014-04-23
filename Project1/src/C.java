public class C {
	public static void main(String[] args) {
		int[] data = { 10, 40, 20, -30, 50, 32};
		processArray(data);

		data = new int[] { 30, 30, 20 };
		processArray(data);

		data = new int[] {};
		data = new int[0];
		processArray(data);
	}

	private static void processArray(int[] data) {
		int max = findmax(data);
		printArray(data);
		System.out.println("Max element : " + max);
	}

	 static void printArray(int[] data) {
		for (int i : data) {
			System.out.println(i);
		}
	}

	private static int findmax(int[] data) {
		if (data.length == 0) {
			System.out.println("no data: empty array");
			return Integer.MIN_VALUE;
		}

		if (data.length == 0) {
			System.out.println("no data: empty array");
			return Integer.MIN_VALUE;
		}
		
		if (data.length == 0) {
			System.out.println("no data: empty array");
			return Integer.MIN_VALUE;
		}

		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

}

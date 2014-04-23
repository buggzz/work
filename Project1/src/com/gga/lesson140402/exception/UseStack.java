package com.gga.lesson140402.exception;

public class UseStack {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		try {
			stack.push(5);
			stack.push(4);
			stack.push(3);
			stack.push(2);
			stack.push(1);
			stack.push(6);
		} catch (MyStackOverflowException e) {
			//e.printStackTrace();
			System.out.println(e.getClass().getSimpleName());
		}

		try {
			System.out.println("Top element: " + stack.top());
		} catch (StackIsEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}

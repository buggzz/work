package com.gga.lesson140402.exception;

public class Stack {

	Object[] items;
	int tos = -1; // top of stack

	public Stack(int maxSize) {
		items = new Object[maxSize];
	}

	public void push(Object object) throws MyStackOverflowException {
		if (tos + 1 == items.length) {
			throw new MyStackOverflowException(items.length, tos);
		}
		tos++;
		items[tos] = object;
	}

	public Object pop() {
		Object result = items[tos];
		items[tos] = null;
		tos--;
		return result;
	}

	public Object top() throws StackIsEmptyException {
		if (isEmpty()) {
			throw new StackIsEmptyException();
		}
		return tos == -1 ? null : items[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

}

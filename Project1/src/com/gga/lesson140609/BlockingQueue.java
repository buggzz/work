package com.gga.lesson140609;

import java.util.Queue;

public class BlockingQueue<T> {
	
	private Queue<T> _items = new LinkedList<> {
		
	public void offer(T item) {
		synchronized (_items) {
			_items.offer(item);
			_items.notify();
		}
	}

	public T poll() {
		return null;
	}
	}

}
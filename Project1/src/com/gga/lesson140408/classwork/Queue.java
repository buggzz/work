package com.gga.lesson140408.classwork;

import com.gga.lesson140408.List;

public class Queue extends List {

	public static class QueueOverflow extends Exception {
		private Object _item;

		public QueueOverflow(Object item) {
			_item = item;
		}

		public Object getItem() {
			return _item;
		}
	}

	public static class QueueUnderflow extends Exception {

	}

	private int _maxsize;

	public Queue(int maxsize) {
		_maxsize = maxsize;
	}

	int count;

	public void put(Object item) throws QueueOverflow {
		if (count == _maxsize) {
			throw new QueueOverflow(item);
		}
		super.add(item);
		count++;
	}

	@Override
	public void add(Object item) {
		throw new UnsupportedOperationException();
	}

	public Object take() throws QueueUnderflow {
		if (first == null) {
			throw new QueueUnderflow();
		}
		Node _tekushii = first;
		first = first.next;
		count--;

		return _tekushii.data;
	}

	public Object head() {
		return first == null ? null : first.data;
	}

	public Object tail() throws QueueUnderflow {
		if (last == null) {
			throw new QueueUnderflow();
		}
		return last.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return count;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(3);

		// queue.head();
		try {
			queue.put("one");
			queue.put("two");
			queue.put("three");

		} catch (QueueOverflow e) {
			System.out.println("queue is full, can't put" + e.getItem());

		}
		// queue.add("one");

		try {

			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (QueueUnderflow e) {

			e.printStackTrace();
		}

	}

}

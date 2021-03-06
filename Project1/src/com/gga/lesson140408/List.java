package com.gga.lesson140408;

public class List {

	protected static class Node {
		public Object data;
		public Node next;

		Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	protected Node first;
	protected Node last;

	public void add(Object item) {
		Node node = new Node(item, null);
		if (last != null) {
			last.next = node;

		} else {
			first = node;
		}

		last = node;
	}
}

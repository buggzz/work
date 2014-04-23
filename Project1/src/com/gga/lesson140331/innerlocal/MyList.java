package com.gga.lesson140331.innerlocal;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList implements SimpleList/*, Iterator */{

//	private static class ListIterator implements Iterator {
//
//		Node next;
//		public ListIterator(Node first) {
//			next = first;
//		}
//
//		@Override
//		public boolean hasNext() {
//			return next != null;
//		}
//		
//		@Override
//		public Object next() {
//			Object result = next.data;
//			next = next.next;
//			return result;
//		}
//		
//		@Override
//		public void remove() {
//		}
//		
//	}
	
	public static class Node {
		private Object data;
		private Node next;
		
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node getNext() {
			return next;
		}
		public Object getData() {
			return data;
		}
	}
	
	protected Node last;
	protected Node first;
	
//	@Override
	public void add (Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		last = node;
	}
	
	public Object delete (Object element) {
		Node node = new Node(element, null);
		node = first; 
		first = last.next;
		return node;
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {
			Node next = first;
			
			@Override
			public boolean hasNext() {
				return next != null;
			}
						
			@Override
			public Object next() {
			    Object result = next.data;
				next = next.getNext();
				return result;
			}
						
			@Override
			public void remove() {
			}

	
		};
	}
	
	public static void main(String[] args) {
		
		SimpleList list = new MyList();
		list.add("one");
		list.add("two");
		list.add("three");
		print(list);
		
		ArrayList<String>  strings = new ArrayList<String>();
		strings.add("раз");
		strings.add("два");
		strings.add("три");
		print(strings);
	}

	private static void print(Iterable list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}

	@Override
	public void add(String element) {
		// TODO Auto-generated method stub
		
	}

}

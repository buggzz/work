package com.gga.lesson140312.interfaces;

public class MyList implements SimpleList {
	
	Node first;
	Node last;
	
	@Override
	public Node first() {
		// TODO Auto-generated method stub
		return first;
	}
	
	@Override
	public void add(String element) {
		Node node = new Node(element, null);
		if (first==null){
			first=node;
		}
		
		if(last != null) {
			last.next=node;
		}
		last=node;
	}

	public static void main(String[] args) {
		SimpleList list = new MyList();
		list.add("four");
		list.add("three");
		list.add("two");
		list.add("one");
		
		Node current = list.first();
		while (current != null){
		    System.out.println(current.data);
			current = current.next;
	    }
	}
	
}

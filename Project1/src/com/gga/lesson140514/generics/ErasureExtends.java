package com.gga.lesson140514.generics;

import com.gga.lesson140514.generics.Erasure.Node;
import com.gga.lesson140514.generics.Erasure.Node2;

public class ErasureExtends {
	static class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> next;
		
		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		T getData() {
			return data;
		}
	}
	
	static class Node2 {
		private Object data;
		private Node2 next;
		
		public Node2(Object data, Node2 next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		Object getData() {
			return data;
		}
	}
}

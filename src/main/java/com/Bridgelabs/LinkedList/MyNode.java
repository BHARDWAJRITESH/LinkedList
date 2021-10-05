package com.Bridgelabs.LinkedList;

public class MyNode<K> {
	private K key;
	private MyNode next;
	
	public MyNode(K key) {
		this.key = key;
		this.next = null;
		
	}
	/**
	 * 
	 * creating getters and setters 
	 */
	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}

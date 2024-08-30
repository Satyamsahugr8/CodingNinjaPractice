package com.java.advanced;

public class StackUsingArray {
	
	private int[] data;
	private int topindex;
	
	

	public StackUsingArray() {
		super();
		data = new int[10];
	}

	public void push(int s) {
		data[topindex+1] = s;
	}

	public int top() {
		return data[topindex];
	}

	public void pop() {
		data[topindex] = 0;
		topindex--;
	}

	public int size() {
		return topindex;
	}

	public boolean isEmpty() {
		return topindex == -1;
		
	}
	
	

}

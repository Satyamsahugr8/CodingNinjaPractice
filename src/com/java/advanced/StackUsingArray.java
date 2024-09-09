package com.java.advanced;

public class StackUsingArray {
	
	private int[] data;
	private int maximum;
	private int topIndex;
	
	
	public StackUsingArray(int size) {
		super();
		data = new int[10];
		maximum = size;
		topIndex = -1;
	}
	
	public StackUsingArray() {
		this(1000);
	}

	public void push(int s) throws StackFullException {
		
		if( topIndex >= maximum ) {
			throw new StackFullException();
		}
		
		data[topIndex+1] = s;
	}

	public int top() throws StackEmptyException {
		
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		
		return data[topIndex];
	}

	public void pop() throws StackEmptyException {
		
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		
		data[topIndex] = 0;
		topIndex--;
	}

	public int size() {
		return topIndex + 1;
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	

}

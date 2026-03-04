package com.java.stack;

public class StackUsingArray {
	
	private int[] data;
	private int maximum;
	private int topIndex;
	
	
	public StackUsingArray(int size) {
		super();
		data = new int[2];
		maximum = size;
		topIndex = -1;
	}
	
	public StackUsingArray() {
		this(1000);
	}

//	public void push(int s) throws StackFullException {
//		
//		if( topIndex >= maximum ) {
//			throw new StackFullException();
//		}
//		
//		topIndex++;
//		data[topIndex] = s;
//	}
	
	public void push(int s) {
		
		if( topIndex == data.length - 1 ) {
			doubleCapacity();
		}
		
		topIndex++;
		data[topIndex] = s;
	}

	private void doubleCapacity() {
		System.out.println("ss");
		int[] temp = data;
		data = new int[ 2 * data.length ];
		
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
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
	
	public void print() {
		System.out.print("stack : [ ");
		for (int i = 0; i < size(); i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	

}

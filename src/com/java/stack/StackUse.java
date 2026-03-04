package com.java.stack;

public class StackUse {

	public static void main(String[] args) throws Exception {
		
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		System.out.println(stack.top());
//		stack.pop();
		stack.push(20);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.print();
		stack.push(20);
		stack.push(20);
		stack.push(20);
		
		stack.print();
		System.out.println(stack.size());

	}

}

package com.java.ArrayQuestions;

public class ArrangeArray {

	public static void main(String[] args) {
		
		int [] arr = new int[6];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if( (i+1)%2 != 0) {
				arr[index] = (i+1);
				index++;
			}
		}
		
		for (int i = arr.length; i > 0; i--) {
			if( (i+1)%2 == 0) {
				arr[index] = (i+1);
				index++;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}

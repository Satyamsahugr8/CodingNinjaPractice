package com.java.ArrayQuestions;

public class ArrangeArray2 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
 		
		for (int i = 0, j = arr.length-1; i <= (arr.length-1)/2; i++,j--) {
			
			// adding two index at a time
			arr[i] = (2*i)+1;
			
			// for old number N = 7
			if(i != j) {
				arr[j] = (2*i)+2;
			}

		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
}

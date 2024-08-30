package com.java.leetcode;

class Solution {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int i : arr) {
			System.out.print(i+",");
		}

		System.out.println();
		
		rotate(arr, 0, 5);
		
		for (int i : arr) {
			System.out.print(i+",");
		}
		
	}
	
	
	
	
	
	
    public static void rotate(int[] arr, int index, int length) {
    	int temp = arr[0];
    	for (int i = 1; i <= arr.length-1; i++) {
			arr[i-1] = arr[i];
		}
    	arr[arr.length-1] = temp;
    }
}
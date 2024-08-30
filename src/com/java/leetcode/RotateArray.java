package com.java.leetcode;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1};
		for (int i : arr) {
			System.out.print(i+",");
		}
		
		System.out.println();
		
		rotatebyN(arr, 2);
		
		for (int i : arr) {
			System.out.print(i+",");
		}

	}

	private static void rotatebyN(int[] arr, int n) {
		
		if(n%2 != 0) {
            n = n+1;
        }
        int [] temp = new int[n];
		for (int i = 0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		for (int i = n ; i < arr.length; i++) {
			arr[i-n] = arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[arr.length-(n-i)] = temp[i];
		}
		
	}

}

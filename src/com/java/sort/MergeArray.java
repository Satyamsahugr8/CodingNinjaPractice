package com.java.sort;

public class MergeArray {

	public static void main(String[] args) {
		int arr[] = {1,5,9};
		int brr[] = {2,3,8};

		int a[] = new int[arr.length + brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		for( ; i<arr.length && j<brr.length; k++) {
			if(arr[i] < brr[j]) {
				a[k] = arr[i];
				i++;
			}
			else if(brr[j] < arr[i]) {
				a[k] = brr[j];
				j++;
			}
		}
		
		for(; i<arr.length; i++) {
			a[k] = arr[i];
			k++;
		}
		
		for(; j<arr.length; j++) {
			a[k] = brr[j];
			k++;	
		}
		
		for (int r : a) {
			System.out.print(r + " ");
		}
		
	}

}
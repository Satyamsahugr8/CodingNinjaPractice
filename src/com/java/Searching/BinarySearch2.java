package com.java.Searching;

public class BinarySearch2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int s = binarySearch(arr, 5);
		System.out.println(s);
	}
	
	private static int binarySearch(int[] arr, int search) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			 
			int mid = (start+end)/2;
			
			if(search == arr[mid]) {
				return mid;
			} else if ( search > arr[mid]) {
				start = mid+1;
			} else if (search < arr[mid]) {
				end = mid-1;
			}
		}
		return -1;
	}
	

}


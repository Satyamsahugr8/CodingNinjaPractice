package com.java.Searching;

public class BinarySearchUsingRecursion {
	
	public static void main(String[] args) {
		
//		int arr[] = {1,2,3,4,5,6,7};
//		
		int arr[] = {-1,0,3,5,9,12};
		// binary search
		int search = 5;
		int first = 0;
		int last = arr.length-1;  // 6
		int s = binarySearch(arr, 12);
		System.out.println(s);
	}
	
	public static int binarySearch(int[] arr, int item) {
		
		return binarySearch(arr, item, 0, arr.length-1);
	}
	
	private static int binarySearch(int[] arr, int item, int first, int last) {
		
		int mid = (first + last)/2; //3 //5 //4
		
		if (first > last) {
			return -1;
		} 
		
		else if(item == arr[mid]) {
			return mid;
		} 
		
		else if (item > arr[mid]) {
			
			first = mid+1;
			return binarySearch(arr, item, first, last);
		} 
		
		else if (item < arr[mid]) {
			
			last = mid-1;
			return binarySearch(arr, item, first, last);
		} 
	
		return -1;
	}

}

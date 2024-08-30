package com.java.Searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		// binary search
		int search = 5;
		int first = 0;
		int last = arr.length-1;  // 6
		int s = binarySearch(arr, search, first, last);
		System.out.println(s);
	}

	private static int binarySearch(int[] arr, int item, int first, int last) {
		
		int mid = (first + last)/2; //3 //5 //4
		
		if (first == last) {
			return first;
		} else if(item == arr[mid]) {
			return mid;
		} else if (item > arr[mid]) {
			first = mid+1;
			return binarySearch(arr, item, first, last);
		} else if (item < arr[mid]) {
			last = mid-1;
			return binarySearch(arr, item, first, last);
		} 
		return -1;
	}

}

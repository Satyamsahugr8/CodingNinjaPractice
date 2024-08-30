package com.java.ArrayQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayMidReverse {
	
	
	private static void countword() {
		// TODO Auto-generated method stub
		String str = "satyam is pagal satyam is mad";
		// output satyam 2 is 2 pagal 1 ,mad 1
		String [] strArray = str.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for (int i = 0; i < strArray.length; i++) {
			set.add(strArray[i]);
		}
		
		Object[] strArrayNew = set.toArray();
		
		for (int i = 0; i < set.size(); i++) {
			int count = 0; 
			for (int j = 0; j < strArray.length; j++) {
				if(strArrayNew[i].equals(strArray[j])) {
					count++;
				}
			}
			System.out.println(strArrayNew[i]+ " "+ count);
		}
		

	}
	
	
	@SuppressWarnings("unused")
	private static void reverse(int [] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= (arr.length-1)/2; i++) {
			int a = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = a;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {

//		int[] arr = {1,3,4,5,7};
//		
//		int[] arr32 = {1,3,4,5,7,4,5};
//		reverse(arr32);
//		int[] arr2 = new int[arr.length];
//		
//		arr2[0] = arr[0];
//		arr2[arr.length-1] = arr[arr.length-1]; 
//		
//		for (int i = 1; i <= arr.length-2; i++) {
//			arr2[i] = arr[arr.length-1-i];
//		}
//		
//		for (int i : arr2) {
//			System.out.print(i + " ");
//		}
		
		countword();
	}

}

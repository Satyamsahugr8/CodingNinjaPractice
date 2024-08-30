/**
 * 
 */
package com.java.ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author satyam
 *
 */
public class DuplicateArray {
	
	public static void iterateByKeysUsingLambda(Map<Integer, Integer> map) {
	    map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));
	}

//	public static void iterateValuesUsingLambda(Map<Integer, Integer> map) {
//	    map.values().forEach(v -> System.out.println(("value: " + v)));
//	}


	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,4};
		int count = 1;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				map.replace(arr[i], ++value);
			} else
				map.put(arr[i], count); 
		}
		
		iterateByKeysUsingLambda(map);
		//iterateValuesUsingLambda(map);
		
//		Object[] arrs = map.entrySet().stream()
//			    .filter(entry -> entry.getValue() < 1)
//			    .map((a)-> a.getKey())
//			    .toArray();
//		
//		for (Object object : arrs) {
//			System.out.println(object);
//		}

	}

}

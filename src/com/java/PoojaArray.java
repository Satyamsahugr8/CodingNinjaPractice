package com.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PoojaArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,1,4,3,6,4,7,6};
		
		Set<Integer> setArray = new HashSet<>(); 
		for (int i : array) {
			setArray.add(i);
		}
		
//		Map<Integer, Integer> map = new HashMap<>();
		
		for (int j : setArray) {
			int count = 0;
			for (int t = 0; t < array.length; t++) {
				if (j == array[t]) {
					count++;
				}
			}
//			map.put(j, count);
			
		}
	
		
		int[] answer = new int[setArray.size()];
		

//		LinkedHashMap<Integer, Integer> hashmap = sortByValue(map);
//		
//		System.out.println(hashmap);
//		
//		int i = 0;
//		for (Map.Entry<Integer, Integer> e : hashmap.entrySet()) {
//			answer[i] = e.getKey();
//				i++;
//		}
//		
//		for (int yi : answer) {
//			System.out.print(yi + ",");
//		}
	
	}
	
	
	public static LinkedHashMap<Integer, Integer> sortByValue(Map<Integer, Integer> map)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
        });
        
        LinkedHashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}

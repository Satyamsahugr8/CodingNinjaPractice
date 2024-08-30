package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class ArrayQuestion {

	public static void main(String[] args) {

		int[] array = { 4, 1, 4, 3, 6, 4, 7, 6 };

		Set<Integer> setArray = new HashSet<>();
		for (int i : array) {
			setArray.add(i);
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] answer = new int[setArray.size()];

		int u = 0;
		for (int j : setArray) {
			int count = 0;
			for (int t = 0; t < array.length; t++) {
				if (j == array[t]) {
					count++;
				}
			}
			map.put(j, count);
			answer[u] = count;
			u++;
		}
	
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
				
			
				
		}
	}

}

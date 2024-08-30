package com.java.ArrayQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    
    public static int sum(List<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
       return sum; 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        
        int[] array = new int[sizeOfArray];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        List<List<Integer>> subArrays = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {          
            
        	for (int j = i; j < array.length; j++) {
                
            	List<Integer> subArray = new ArrayList<>();
                
            	for (int k = i; k <= j; k++) {
                    subArray.add(array[k]);
                }
//                int k = i;
//                while(k<j) {
//                	subArray.add(array[k]);
//                	k++;
//                }
                subArrays.add(subArray);  
            }
        }
        
        for (List<Integer> i : subArrays) {
			System.out.print(i);
		}
        System.out.println();
        
        int[] sumofArray = new int[subArrays.size()];
        for (int i = 0; i < subArrays.size(); i++) {
            sumofArray[i] = sum(subArrays.get(i));
        }
        
        for (int i : sumofArray) {
			System.out.print(i+ " ");
		}
        
        int count = 0;
        for (int i : sumofArray) {
			if(i<0) {
				count++;
			}
		}
        
        System.out.println("count: "+count);
    }
}   
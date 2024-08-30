package com.java.ArrayQuestions;
import java.util.ArrayList;
import java.util.List;

public class SubarrayGenerator1 {

    public static List<List<Integer>> generateSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            for (int end = start + 1; end <= arr.length; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    subarray.add(arr[i]);
                }
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 4, 4};
        List<List<Integer>> result = generateSubarrays(inputArray);

        for (List<Integer> subarray : result) {
            System.out.print(subarray + " ");
        }
    }
}

package com.java.goldcoin;

public class GoldCoin {
	
	public static void main(String[] args) {
		//number of rooms
		int N = 10;
		int k = 15;
		int coins[] = {5,3,7,14,18,1,15,4,3,8};
		
		int output[] = findRooms(N, k, coins);
		
		System.out.print((output[0]+1) + " and "+ (output[1]+1));
		
		
	}
	
	private static int[] findRooms (int N, int K, int[] coins) {
		int start = 0, end = 0, Sum = 0;
		int result[] = {0, Integer.MAX_VALUE};
		
		while (end < N) {
			Sum += coins[end]; 
			
			while (Sum > K) { 
				Sum -= coins[start]; 
				start++;
			}
		
		@SuppressWarnings("unused")
		boolean value = end - start < result[1] - result[0];
			
		if (Sum == K && (end - start < result[1] - result[0])) {
			result[0] = start;
			result[1] = end;
		}
		
		end++;
	}
		
		if(result[1] == Integer.MAX_VALUE) {
			System.out.println("No solution found");
		}
		
		return result;
	}

}

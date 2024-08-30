/**
 * 
 */
package com.java.array2d;

/**
 * @author satya
 *
 */
public class Two2DArray {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{2,3,4},{3,4,5}};
		
		//int arr2[][] = new int[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				 if( i < j ) {
					 arr[i][j] = 0;
				 } 
				 else 
					 arr[i][j] = arr[i][j];
			}
		 }

		// print new array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

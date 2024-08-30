package com.java.recursion;

public class Square {

	public static int multiple(int a, int n) {
		if( n == 0 ) return 1;
		n--;
		return a* multiple(a, n);
	}
	
	public static void main(String[] args) {
		
		int res = multiple(3, 4);
		System.out.println(res);

	}

}

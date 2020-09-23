package com.test.daytwo;

public class RecursiveTwo {

	public static void main(String[] args) {
		
		int f = fact(5);
		System.out.println(f);
	}
	
	public static int fact(int n) {
		
		if(n == 0 || n ==1)
			return 1;
		
		return n * fact(n - 1);
	}
}

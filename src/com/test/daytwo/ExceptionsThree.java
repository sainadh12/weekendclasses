package com.test.daytwo;

public class ExceptionsThree {

	public static void main(String[] args) {
		
		int a[] = new int[7];
		
		try {
			int b = a[8];
			System.out.println("This is b value at index 8 " +b);
		} catch (Exception e) {
			System.out.println("Sorry, You cannot access an array element beyond it's limit");
		}
	}
}
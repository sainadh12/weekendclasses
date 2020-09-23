package com.test.dayone;

public class Array {

	public static void main(String[] args) {
		
		int[] myArray = {1, 3, 54, 34, 12,1, 3, 54, 34, 12,1, 3, 54, 34, 12,1, 3, 54, 34, 12,1, 3, 54, 34, 12,1, 3, 54, 34, 12};

		int sum = 0;
		for(int i = 0; i < myArray.length; i++) {
			//System.out.println(myArray[i]);
			//Sum of array elements
			//sum = sum+myArray[i];
			
			sum+=myArray[i];
		}
		
		System.out.println(sum);
	}
}
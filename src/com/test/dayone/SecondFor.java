package com.test.dayone;

public class SecondFor {

	public static void main(String[] args) {

		int i,j;

		for(i = 1; i < 5; i++) {
			
			for(j = 1; j < i + 1; j++) {
			
				System.out.println(i);
			}
		}
	}
}
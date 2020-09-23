package com.test.daytwo;

public class Recursive {

	public static void main(String[] args) {
		
		m1(0);
	}
	
	public static void m1(int i) {
		
		System.out.println(i);
		if(i == 4)
			return;
		
		m1(i+1);
		System.out.println(i);
	}
}

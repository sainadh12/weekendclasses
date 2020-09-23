package com.test.dayone;

public class Conditional {

	public static void main(String[] args) {
		
		int a = 100;
		
		if(a == 10) {
			System.out.println("A value is 10");
		} else if(a == 12){
			System.out.println("A value is 12");
		} else if (a < 13) {
			System.out.println("A value is less than 13");
		}
		else {
			System.out.println("A value doesn't match");
		}
	}
}
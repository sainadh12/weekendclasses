package com.test.daytwo;

public class ExceptionTwo {
	
	public static void main(String[] args) {
		
		String someValue = null;
		try {
			System.out.println(someValue.length());
		} catch (Exception e) {
			System.out.println("Don't try to get length of a NULL String");
		}
	}
}

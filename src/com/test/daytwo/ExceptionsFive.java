package com.test.daytwo;

public class ExceptionsFive {

	public static void main(String[] args) {
		
		try {
			try {
				System.out.println("Inside the Block 1");
				int b = 45/0;
				System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println("Exception : e1");
			}
			
			try {
				System.out.println("Inside the Block 2");
				int b = 45/0;
				System.out.println(b);
			} catch (Exception e) {
				System.out.println("Exception : e2");
			}
		} catch (ArithmeticException e) {
			System.out.println("Exception : e3");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : e4");
		} catch (Exception e5) {
			System.out.println("Exception : e5");
		}
	}
}
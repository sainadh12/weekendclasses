package com.test.daytwo;

public class ExceptionsFour {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[7];
			a[9] = 30/2;
			System.out.println("This print statement is from TRY block");
		} catch (ArithmeticException e) {
			System.out.println("Warning: Artithmetic Exception encountered");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: Array Out of Bounds Exception encountered");
		} catch (Exception e) {
			System.out.println("Warning: Unknown Exception encountered");
		}
		
		System.out.println("Out of try-catch block");
	}
}

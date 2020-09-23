package com.test.dayone;

public class Sum {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public void someMethod(int a, String value, String value2) {
		System.out.println("THis is int a value "+a);
		System.out.println("THis is string a value "+value);
		System.out.println("THis is string a value "+value2);
	}
	/*
	 * public int sum(int a, int b, String ab) { return a + b; }
	 * 
	 * public int sum(int a, int b, int c) { return a + b + c; }
	 * 
	 * public int sum(int a, int b, int c, int d) { return a + b + c + d; }
	 * 
	 * public int sum(int a, int b, int c, int d, int e) { return a + b + c + d + e;
	 * }
	 */
	
	public static void main(String[] args) {
		
		Sum referenceVariable = new Sum();
		
		referenceVariable.someMethod(99, "ValueOneSample", "ValueTwoSample");
		/*
		 * System.out.println(referenceVariable.sum(12, 12));
		 * System.out.println(referenceVariable.sum(12, 12, 13, 14));
		 */
	}
}
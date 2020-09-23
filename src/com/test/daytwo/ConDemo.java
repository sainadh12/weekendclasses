package com.test.daytwo;

public class ConDemo {

	int a;
	int b;
	String globalString;
	
	public static void main(String[] args) {
		
	}

	public ConDemo() {
		System.out.println("Default constructor");
	}
	
	public ConDemo(int x, int y) {
		System.out.println("This is parameterised constructor with int, int");
		
		a = x;
		b = y;
	}
	
	public ConDemo(int x, int y, String str) {
		System.out.println("This is parameterised constructor with int, int");
		
		a = x;
		b = y;
	}
	
	public void addition() {
		
		int c = a + b;
		System.out.println("A value is "+a+ " and B value is "+b);
		System.out.println("Addition of both values is "+c);
	}
	
	public void subtraction() {
		
		int c = a - b;
		System.out.println("A value is "+a+ " and B value is "+b);
		System.out.println("Subtraction of both values is "+c);
	}
}
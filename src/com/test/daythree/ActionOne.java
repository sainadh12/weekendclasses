package com.test.daythree;

public class ActionOne implements ActionLevels{

	public void actions() {
		System.out.println("I'm running class");
	}

	public void time() {
		System.out.println("Some time is running");
	}

	public void time(int time) {
		System.out.println("Time running is " +time);
	}
	
	public void someMethod() {
		System.out.println("Some method from class");
	}
	
	public void someMethodTwo() {
		System.out.println("Some method from class");
	}
}
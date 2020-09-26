package com.test.daythree;

public class ActionTwo implements ActionLevels{

	public void actions() {
		System.out.println("I'm running class from Action Two");
	}

	public void time() {
		System.out.println("Some time is running from Action Two");
	}

	public void time(int time) {
		System.out.println("Time running is " +time+ " from Action Two");
	}
}

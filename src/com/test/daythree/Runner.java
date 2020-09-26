package com.test.daythree;

public class Runner {

	public static void main(String[] args) {
		
		ActionLevels actionOne = new ActionOne();
		actionOne.actions();
		//actionOne.
		
		ActionLevels actionTwo = new ActionTwo();
		actionTwo.actions();
		
		ActionOne one = new ActionOne();
		one.actions();
		one.time();
		one.time(12);
		one.someMethod();
		one.someMethodTwo();
	}
}
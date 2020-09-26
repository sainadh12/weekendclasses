package com.test.daythree;

import java.util.ArrayList;

public class AListExample {

	public static void main(String[] args) {
		
		ArrayList<String> objReference = new ArrayList<String>();
		
		objReference.add("a");
		objReference.add("b");
		objReference.add("c");
		objReference.add("d");
		objReference.add("e");
		objReference.add("f");
		objReference.add("g");
		objReference.add("h");
		
		//System.out.println(objReference);
		
		//objReference.remove(4);
		//For each loop
		for(String s : objReference) {
			
		}
		
		System.out.println("After removing the element "+objReference);
	}
}

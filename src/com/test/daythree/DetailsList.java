package com.test.daythree;

import java.util.ArrayList;
import java.util.Collections;

public class DetailsList {

	public static void main(String[] args) {
		
		ArrayList<String> listOfCOuntries = new ArrayList<String>();
		listOfCOuntries.add("India");
		listOfCOuntries.add("Prague");
		listOfCOuntries.add("Barcelone");
		listOfCOuntries.add("Amsterdam");
		listOfCOuntries.add("United States");
		
		System.out.println("Before sorting the list \n");
		
		for(String country : listOfCOuntries)
			System.out.println(country);
		
		Collections.sort(listOfCOuntries);
		//Quick, Bubble, Merge
		
		System.out.println("After sorting the list \n");
		
		for(String country : listOfCOuntries)
			System.out.println(country);
	}
}

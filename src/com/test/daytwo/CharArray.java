package com.test.daytwo;

public class CharArray {

	public static void main(String[] args) {
		
		String str = "Basic";
		
		char[] inToChars = str.toCharArray();
		
//		char[] itConverted = {'B', 'a', 's', 'i','c'};
		
		char c = str.charAt(2);
		
		System.out.println(c);
		
		char[] chars2 = new char[7];
		
		str.getChars(0, 3, chars2, 5);

		System.out.println(chars2);
	}
}

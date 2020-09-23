package com.test.dayone;

public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'X';

		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Better");
			break;
		case 'D':
			System.out.println("Better");
			break;
		case 'E':
			System.out.println("Bad");
			break;

		default:
			System.out.println("Invalid Grade");
		}
	}
}

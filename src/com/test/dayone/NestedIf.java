package com.test.dayone;

public class NestedIf {

	public static void main(String[] args) {

		int age = 37;
		char gender = 'F';

		if(age > 35) {
			if(gender == 'M') {
				System.out.println("Man");
			}else {
				System.out.println("Women");
			}
		}else {
			if(gender == 'M') {
				System.out.println("Boy");
			}else {
				System.out.println("Girl");
			}
		}
	}
}
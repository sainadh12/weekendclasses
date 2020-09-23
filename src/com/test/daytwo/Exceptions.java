package com.test.daytwo;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			int num1, num2 ;
			num1 = 0;
			num2 = 50;
			System.out.println(num2/num1);
		} catch(Exception e) {
//			System.out.println("You got an arthmetic exeception, you are not supposed to divide any number with ZERO");
			System.out.println("You have got any unknown exception, please refer the stack trace " +e.getStackTrace());
		}
	}
}

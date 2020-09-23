package com.test.dayone;

public class ConditionalIf {

	public static void main(String[] args) {

		int val1 = 53;
		int val2 = 2;

		int result;

		String operation = "mul";

		if(operation == "add") {
			result = val1 + val2;
		}else if (operation == "sub") {
			result = val1 - val2;
		}else if (operation == "mul") {
			result = val1 * val2;
		}else if (operation == "div") {
			result = val1 / val2;
		}else {
			result = 0;
		}
		System.out.println("Result of "+operation +" is "+result);

	}
}
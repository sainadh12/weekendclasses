package com.test.daythree;

public class AbsDemo {

	public static void main(String[] args) {
		
		XPhoneTwo two = new XPhoneTwo();
		two.type();
		two.model();
		two.screen();
		
		PhoneFeatures feature = new XPhoneTwo();
		feature.type();
		feature.model();
	}
}

abstract class PhoneFeatures{

	abstract void type();
	abstract void model();
	abstract void screen();
	abstract void ram();
	abstract void os();
}

abstract class XPhoneOne extends PhoneFeatures{

	public void type() {
		System.out.println("This is mobile phone");	
	}
	
	public void model() {
		System.out.println("This is some XPhone");	
	}
}

class XPhoneTwo extends XPhoneOne{
	
	public void screen() {
		System.out.println("This is screen");
	}
	public void ram() {
		System.out.println("This is ram");
	}
	public void os() {
		System.out.println("This is os");
	}
}
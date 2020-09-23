package com.test.daytwo;

public class NoRev {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.show();
		
		Samsung samsung = new Samsung();
		samsung.show();
		
		
	}
}

abstract class Phone{
	abstract void phoneRam();
	abstract void phoneProcessor();
	abstract void phoneScreen();
	abstract void show();
}

class Samsung extends Phone{

	void phoneRam() {
		System.out.println("RAM 10 GB");
	}
	void phoneProcessor() {
		System.out.println("Processor SD 989");
	}
	void phoneScreen() {
		System.out.println("Screen Size 5 Inch Screen");
	}
	void show() {
		phoneRam();
		phoneProcessor();
		phoneScreen();
	}
}

class Apple extends Phone{
	void phoneRam() {
		System.out.println("RAM 8 GB");
	}
	void phoneProcessor() {
		System.out.println("Processor SD Bionic Chip");
	}
	void phoneScreen() {
		System.out.println("Screen Size 4 Inch Screen");
	}
	void show() {
		phoneRam();
		phoneProcessor();
		phoneScreen();
	}
}
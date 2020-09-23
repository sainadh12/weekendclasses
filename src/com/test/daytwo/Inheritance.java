package com.test.daytwo;

public class Inheritance {

	public static void main(String[] args) {
		
		/*
		 * Animal animal = new Animal(); animal.eat();
		 */
		
		/*
		 * Dog dog = new Dog(); dog.bark(); dog.eat();
		 * 
		 * Cat cat =new Cat(); cat.eat(); cat.meow();
		 */
		
		BabyDog dog = new BabyDog();
		
		dog.eat();
		dog.weep();
		dog.bark();
	}
}

class Animal{

	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping...");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Meowing...");
	}
}
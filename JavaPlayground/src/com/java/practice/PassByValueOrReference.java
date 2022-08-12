package com.java.practice;

public class PassByValueOrReference {

	/*
	 * Java is officially always pass-by-value. The question is, then, “what is
	 * passed by value?” As we have said in class, the actual “value” of any
	 * variable on the stack is the actual value for primitive types (int, float,
	 * double, etc) or the reference for reference types. That is, for a reference
	 * variable, the value on the stack is the address on the heap at which the real
	 * object resides. When any variable is passed to a method in Java, the value of
	 * the variable on the stack is copied into a new variable inside the new
	 * method.
	 */

	public static void main(String[] args) {

		Cheese myCheese = new Cheese();

		myCheese.setLevelOfStinkiness(10);

		System.out.println(myCheese.getLevelOfStinkiness());

		incLevelOfStinkiness(myCheese);

		System.out.println(myCheese.getLevelOfStinkiness());

		decLevelOfStinkiness(myCheese);

		System.out.println(myCheese.getLevelOfStinkiness());

	}

	private static void incLevelOfStinkiness(Cheese cheese) {

		cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1); // here the cheese have same memory address of
																		// myCheese so (here it appears that pass by
																		// reference is taking place but what actually
																		// happens is that in java memory address of
																		// myCheese object is passes value here so it is
																		// pass by value)
	}

	private static void decLevelOfStinkiness(Cheese cheese) {

		cheese = new Cheese(); // here we are assigning cheese a whole new object so the decrease dosen't
								// happened

		cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() - 1);
	}

}

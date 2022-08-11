package com.java.practice;

public class HelloWorld {

	public static void main(String args[]) {
		System.out.println("\t\t Basic java here \t\t");

		System.out.println("\t\t \"Type Casting\" \t\t\n");
		int smlInt = 10;
		double smlDouble = smlInt;

		double bigDouble = 1021322.322;

		int bigInt = (int) bigDouble;

		System.out.println(smlDouble);

		System.out.println(bigInt);

		int strInt = Integer.parseInt("122322");

		String doubleString = Double.toString(bigDouble);

		System.out.println(strInt);
		System.out.println(doubleString);

		System.out.println("\n\t\t \" Operations \" \t\t\n");

		int incMe = 0;
		System.out.println("increased : " + (incMe++));
		System.out.println("increased : " + (++incMe));

	}

}

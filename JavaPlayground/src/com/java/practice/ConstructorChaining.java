package com.java.practice;

/*Constructor Chaining is the process of calling one constructor of a class 
 * from another constructor of the same class or another class using 
 * the current object of the class. */

class Student {
	/*
	 * If we want to call the constructor from the same class, then we use this
	 * keyword.
	 */
	String name;
	int rollNumber;

	Student() {
		this("kala");// here default constructor is calling the constructor with this() keyword
		System.out.println("Default Constructor");

	}

	Student(String sName) {
		this("kala", 1);
		System.out.println("Parameterized Constructor1 Student info " + name);

	}

	Student(String sName, int rollNo) {
		this.name = sName;
		this.rollNumber = rollNo;
		System.out.println("Parameterized Constructor2  Student info  name" + name + "--> roll no-->" + rollNumber);
	}

}

class Customer extends Student {

	/*
	 * we want to call the constructor from the parent class, then we use the super
	 * keyword
	 */

	String debitCard;

	Customer() {
		this("MasterCard");
		System.out.println(" Default constructor child class");
	}

	Customer(String debitCardProvider) {
		super();// Here we are using super keyword to call the constructor of parent class from
				// child class as constructor chaining
		this.debitCard = debitCardProvider;
		System.out.println("Child class having student with customer with debit card provider as:- " + debitCard);

	}

}

public class ConstructorChaining {

	public static void main(String args[]) {

//		Student s1 = new Student();
		@SuppressWarnings("unused")
		Customer c1 = new Customer();

	}

}

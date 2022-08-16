package com.java.design_patterns.factory;

public abstract class Plan {

	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {

		System.out.println("Bill-->" + units*rate);
	}

}

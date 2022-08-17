package com.java.design_patterns.builder;

public class Customer {

	public static void main(String args[]) {

		Pc myCustomPc = new PcBuilder().setOs("mac").setSpace("1000").setProcessor("i7").getCustomPc();

		System.out.println(myCustomPc);

	}

}

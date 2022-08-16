package com.java.design_patterns.factory;

import java.util.Scanner;

public class GenerateBill {

	/*
	 * A Factory Pattern or Factory Method Pattern says that just define an
	 * interface or abstract class for creating an object but let the subclasses
	 * decide which class to instantiate. In other words, subclasses are responsible
	 * to create the instance of the class.
	 * 
	 * Factory Method Pattern allows the sub-classes to choose the type of objects
	 * to create. It promotes the loose-coupling
	 */

	public static void main(String[] args) {

		PlanFactory factory = new PlanFactory();

		Plan planType = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of plan for which the bill will be generated: ");

		if (sc.hasNextLine()) {
			String planSuscribed = sc.nextLine();

			int units = sc.nextInt();

			planType = factory.getPlan(planSuscribed);

			if (planType != null) {
				System.out.println("Unit used for plan " + planSuscribed + "   is -->" + units);
				planType.getRate();
				planType.calculateBill(units);
			} else
				System.out.println("enter your plan domestic ,industrial, commercial ");

		}

		sc.close();

	}

}

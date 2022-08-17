package com.java.design_patterns.strategy;

public class DefensiveStrategy implements Strategy {

	@Override
	public void actionCommand() {
		System.out.println("Defensive Strategy. Protect Self and Teammates");

	}

}

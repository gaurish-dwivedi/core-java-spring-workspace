package com.java.design_patterns.strategy;

public class AggressiveStrategy implements Strategy {

	@Override
	public void actionCommand() {
		System.out.println("Aggresive Strategy. Find and kill opponents!!");

	}

}

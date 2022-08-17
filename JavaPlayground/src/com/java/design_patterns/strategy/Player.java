package com.java.design_patterns.strategy;

public class Player {

	Strategy strategy;
	String type;

	public Player(String type) {
		super();
		this.type = type;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void action() {
		System.out.println("Player : " + this.type);
		strategy.actionCommand();
	}

}

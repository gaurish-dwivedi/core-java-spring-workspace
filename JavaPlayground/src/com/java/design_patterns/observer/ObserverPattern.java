package com.java.design_patterns.observer;

public class ObserverPattern {

	public static void main(String args[]) {

		ScoreBoard sb = new ScoreBoard();

		Observer one = new ObserverImpl("Observer1");
		Observer two = new ObserverImpl("Observer2");
		Observer three = new ObserverImpl("Observer3");

		sb.register(one);
		sb.register(two);
		sb.register(three);

		one.subscribe(sb);
//		two.subscribe(sb);
		three.subscribe(sb);

		sb.postMessage("Game started");

//		sb.unRegister(two);
//
//		sb.postMessage("Game ended");

	}
}

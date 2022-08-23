package com.java.multithreading;

public class MyAnotherThread extends Thread {

	public void run() {
		for (int x = 10; x >= 1; x--) {
			System.out.println("Value of Another Thread x is " + x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}

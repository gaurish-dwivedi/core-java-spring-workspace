package com.java.multithreading;

public class MyThread implements Runnable {

	@Override
	public void run() {

		for (int x = 1; x <= 10; x++) {
			System.out.println("Value of x is  " + x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println(e);
			}
		}
	}

	public static void main(String args[]) {
		MyThread t = new MyThread();

		Thread thread = new Thread(t);

		MyAnotherThread thread2 = new MyAnotherThread();

		thread.start();

		thread2.start();
	}

}

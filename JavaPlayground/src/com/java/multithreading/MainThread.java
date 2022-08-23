package com.java.multithreading;

class UserThread extends Thread {
	public void run() {

		System.out.println("user defined Thread");

	}

}

class DaemonThread extends Thread {
	public void run() {

		System.out.println("Daemon Thread is running");

	}

}

public class MainThread {

	public static void main(String[] args) {

		int a = 50;
		int b = 50;
		System.out.println("program is starting");
		System.out.println("Sum of a and b is = " + (a + b));
		Thread t = Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Object " + t);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Id " + t.getId());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Name " + t.getName());
		System.out.println("Is Alive " + t.isAlive());
		System.out.println("Is Daemon " + t.isDaemon());

		System.out.println("Program ended");

		UserThread userThread = new UserThread();
		userThread.start();
		userThread.setName("User Thread");
		System.out.println("User Defined Thread " + userThread.getName());

		System.out.println("Daemon thread");
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(true);
		System.out.println("Daemon Thread is alive " + daemonThread.isAlive());
		System.out.println("Is Daemon Thread?  " + daemonThread.isDaemon());
		daemonThread.start();
		System.out.println("Daemon Thread is alive " + daemonThread.isAlive());

	}

}

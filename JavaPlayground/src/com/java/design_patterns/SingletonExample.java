package com.java.design_patterns;

/*
 * Singleton Pattern says that just"define a class that has only one instance and provides
 * a global point of access to it".
 * 
 * Early/Eager Instantiation: creation of instance at load time.
 * Lazy Instantiation: creation of instance when required.
 * 
 * */

class SingletonEagar {

	private static SingletonEagar instance = new SingletonEagar();

	private SingletonEagar() {

	}

	public static SingletonEagar getInstance() {
		return instance;
	}

}

class SingletonLazy {

	private static SingletonLazy instance;

	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}

		return instance;

	}

}

class SingletonSync {
	private static SingletonSync instance;

	private SingletonSync() {
	}

	// Thread Safe Synchronized Method
	public static synchronized SingletonSync getInstance() {
		if (instance == null) {
			instance = new SingletonSync();
		}

		return instance;

	}

}

public class SingletonExample {

	public static void main(String args[]) {

		SingletonEagar instance1 = SingletonEagar.getInstance();
		SingletonEagar instance2 = SingletonEagar.getInstance();
		SingletonEagar instance3 = SingletonEagar.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);

		SingletonLazy instanceA = SingletonLazy.getInstance();
		SingletonLazy instanceB = SingletonLazy.getInstance();
		SingletonLazy instanceC = SingletonLazy.getInstance();

		System.out.println(instanceA);
		System.out.println(instanceB);
		System.out.println(instanceC);

		SingletonSync instance11 = SingletonSync.getInstance();
		SingletonSync instance22 = SingletonSync.getInstance();

		System.out.println(instance11);
		System.out.println(instance22);

	}

}

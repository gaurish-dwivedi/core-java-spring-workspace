package com.java.design_patterns.abstract_factory;

public class FactoryGenerator {

	public static AbstractDeviceFactory getFactory(FactoryTypes factoryType) {
		switch (factoryType) {
		case Laptop:
			return new LaptopFactory();
		case Mobile:
			return new MobileFactory();

		default:
			return null;
		}
	}

}

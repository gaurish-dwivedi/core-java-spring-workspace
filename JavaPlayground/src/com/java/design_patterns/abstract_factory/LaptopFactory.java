package com.java.design_patterns.abstract_factory;

public class LaptopFactory extends AbstractDeviceFactory {

	@Override
	public Device getGadget(DeviceTypes deviceType) {
		switch (deviceType) {
		case Dell:
			return new Dell("32", "i7", "nVEDIA");
		case Hp:
			return new Hp("4", "i3", "AMD");
		default:
			return null;
		}

	}

}

package com.java.design_patterns.abstract_factory;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	public Device getGadget(DeviceTypes deviceType) {
		switch (deviceType) {
		case Apple:
			return new Apple("4", "A1");
		case Samsung:
			return new Samsung("8", "Exynos 9825");

		default:
			return null;
		}
	}

}

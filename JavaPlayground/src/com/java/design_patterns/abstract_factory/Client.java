package com.java.design_patterns.abstract_factory;

public class Client {

	public static void main(String[] args) {

		Device dell = FactoryGenerator.getFactory(FactoryTypes.Laptop).getGadget(DeviceTypes.Dell);

		System.out.println(dell.getDetails());
		System.out.println(dell.toString());

		Device hp = FactoryGenerator.getFactory(FactoryTypes.Laptop).getGadget(DeviceTypes.Hp);

		System.out.println(hp.getDetails());
		System.out.println(hp.toString());

		Device apple = FactoryGenerator.getFactory(FactoryTypes.Mobile).getGadget(DeviceTypes.Apple);

		System.out.println(apple.getDetails());
		System.out.println(apple.toString());

	}

}

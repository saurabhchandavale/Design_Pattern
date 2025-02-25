package com.abstractfactory.pattern;

public class EuropeClassFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Hatchback();
	}

	@Override
	public CarSpecification createSpecification() {
		return new EuropenSpecification();
	}

}

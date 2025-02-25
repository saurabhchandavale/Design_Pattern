package com.abstractfactory.pattern;

public class AmericanCarFactory implements CarFactory {

	public Car createCar() {
		return new Sedan();
	}

	public CarSpecification createSpecification() {
		return new AmericanSpecification();
	}

}

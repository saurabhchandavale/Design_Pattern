package com.abstractfactory.pattern;

public class TestImpl {

	public static void main(String[] args) {
		CarFactory americanCarFactory = new AmericanCarFactory();
		Car createCar = americanCarFactory.createCar();
		createCar.assemble();
		CarSpecification createSpecification = new AmericanCarFactory().createSpecification();
		createSpecification.display();
		
		Car createCar2 = new EuropeClassFactory().createCar();
		createCar2.assemble();
		CarSpecification createSpecification2 = new EuropeClassFactory().createSpecification();
		createSpecification2.display();
		
	}

}

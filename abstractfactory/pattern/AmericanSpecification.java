package com.abstractfactory.pattern;

public class AmericanSpecification implements CarSpecification {

	@Override
	public void display() {
		System.out.println("American Display");
	}

}

package com.abstractfactory.pattern;

public class Sedan implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling Sedan Car");
	}

}

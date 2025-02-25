package com.factory.designpattern;

public class ShapeFactory {
	
	public Shape getShape(String input) {
		switch(input) {
		case "CIRCLE":
			return new Circle();
		case "Square":
			return new Square();
		case "Rectangle":
			return new Rectangle();
		default:
			return null;
		
		}
	}

}

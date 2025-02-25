package com.factory.designpattern;

public class TestImpl {

	public static void main(String[] args) {
		ShapeFactory shape = new ShapeFactory();
	    Shape shape2 = shape.getShape("CIRCLE");
	    shape2.draw();
	    
	    ShapeFactory shape3 = new ShapeFactory();
	    Shape shape4 = shape3.getShape("Square");
	    shape4.draw();
	}

}

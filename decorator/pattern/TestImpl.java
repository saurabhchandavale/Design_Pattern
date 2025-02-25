package com.decorator.pattern;

public class TestImpl {

	public static void main(String[] args) {
		
		BasePizza basePizza  = new ExtraCheese( new Margherita());
		int coast = basePizza.coast();
		System.out.println("Cost of Margherita Pizza with extra cheese " + coast);
		
		BasePizza pizza = new Mushroom(new ExtraCheese(new VegDelight()));
		int coast2 = pizza.coast();
		System.out.println("Cost of Veg Delight Pizza with extra cheese and mushroom " + coast2) ;

	}

}

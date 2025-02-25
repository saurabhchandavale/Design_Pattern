package com.decorator.pattern;

public class Mushroom extends Toppings {
	BasePizza basePizza;

	public Mushroom(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}

	@Override
	public int coast() {
		return this.basePizza.coast() + 40;
	}

}

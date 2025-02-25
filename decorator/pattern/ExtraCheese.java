package com.decorator.pattern;

public class ExtraCheese extends Toppings {
	BasePizza basePizza;

	@Override
	public int coast() {
		return this.basePizza.coast() + 20;
	}

	public ExtraCheese(BasePizza basePizza) {
		super();
		this.basePizza = basePizza;
	}


}

package com.siddhi.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get raw materials");
		System.out.println("Get utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");
	}

}

package com.siddhi.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber ob = new BiNumber(2,3);
		
		System.out.println(ob.add());
		System.out.println(ob.multiply());
		
		ob.doubleValue();
		
		System.out.println(ob.getX());
		System.out.println(ob.getY());

	}

}

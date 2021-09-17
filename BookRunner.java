package com.siddhi.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book ob = new Book(123,"OOP with Java","Siddhi");
		ob.addReview(new Review(10, "Great",5));
		ob.addReview(new Review(9, "Average",5));
		
		System.out.println(ob);
	}

}

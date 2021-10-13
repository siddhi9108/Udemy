package com.siddhi.oops;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfCompterProgramming = new Book(11);
		Book effectiveJava = new Book(11);
		Book cleanCode = new Book(11);

		System.out.println(artOfCompterProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		// artOfCompterProgramming.noOfCopies=12;
		// effectiveJava.noOfCopies=11;
		// cleanCode.noOfCopies=1;

		artOfCompterProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(100);
		cleanCode.setNoOfCopies(100);

		// artOfCompterProgramming.increaseNoOfCopies(50);
		// effectiveJava.increaseNoOfCopies(50);
		// cleanCode.increaseNoOfCopies(50);

		// artOfCompterProgramming.decreaseNoOfCopies(50);
		// effectiveJava.decreaseNoOfCopies(50);
		// cleanCode.decreaseNoOfCopies(50);

		System.out.println(artOfCompterProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}
}

package com.siddhi.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student ob = new Student("Siddhi", 97, 99, 100);

		int number = ob.getNumberOfMarks();
		System.out.println(number);

		int sum = ob.getTotalSumOfMarks();
		System.out.println(sum);

		int maxMark = ob.getMaxMarks();
		System.out.println(maxMark);

		int minMark = ob.getMinMarks();
		System.out.println(minMark);

		BigDecimal avg = ob.getAvgMarks();
		System.out.println(avg);

		ob.addNewMark(35);
		System.out.println(ob);
		
		ob.removeMarkAtIndex(0);
		System.out.println(ob);

		// System.out.println(ob);
	}

}

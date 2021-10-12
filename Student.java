package com.siddhi.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Integer> arr = new ArrayList<Integer>();

	public Student(String name, int... arr) {
		this.name = name;
		for (int mark : arr) {
			this.arr.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// for (int mark : arr) {
		// System.out.println(mark);
		// }
		return arr.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : arr) {
			sum += mark;
		}
		// for (int i = 0; i < arr.size(); i++) {
		// sum = sum + arr[i];
		// System.out.println(sum);
		// }
		return sum;
	}

	public int getMaxMarks() {
		int max = Integer.MIN_VALUE;
		for (int mark : arr) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinMarks() {
		int min = Integer.MAX_VALUE;
		for (int mark : arr) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAvgMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public void addNewMark(int mark) {
		arr.add(mark);
	}

	public String toString() {
		return name + arr;
	}

	public void removeMarkAtIndex(int index) {
		arr.remove(index);
	}
}

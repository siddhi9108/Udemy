package com.siddhi.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] arr = { "Mon", "Tues", "Wednes", "Thurs", "Fri", "Sat", "Sun" };

		String dayWithMostChar = "";
		for (String s : arr) {
			if (s.length() > dayWithMostChar.length()) {
				dayWithMostChar = s;
			}
		}
		System.out.println("Day with most Characters: " + dayWithMostChar);
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		//System.out.println("Done");
	}

}

package com.siddhi.ifStatement;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(isWeekDay(6));
	}

	public static boolean isWeekDay(int x) {
		switch (x) {
		case 1:
			// return true;
			// break;
		case 2:
			// return true;
			// break;
		case 3:
			// return true;
			// break;
		case 4:
			// return true;
			// break;
		case 5:
			return true;
		// break;
		case 6:
			// return false;
			// break;
		case 7:
			return false;
		// break;
		// return false;

		}
		return false;
	}

	public static String determineNameOfDay(int x) {
		// String s = " ";
		switch (x) {
		case 1:
			return "Monday";
		// break;
		case 2:
			return "Tuesday";
		// break;
		case 3:
			return "Wednesday";
		// break;
		case 4:
			return "Thursday";
		// break;
		case 5:
			return "Friday";
		// break;
		case 6:
			return "Saturday";
		// break;
		case 7:
			return "Sunday";
		// break;
		}
		return "Invalid";
	}

}

package com.siddhi.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
			// String s = null;
			// s.length();
			int[] i = { 1, 2 };
			int n = i[3];
			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

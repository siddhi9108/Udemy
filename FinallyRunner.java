package com.siddhi.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner ob = null;
		try {
			ob = new Scanner(System.in);

			int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int n1 = n[20];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before scanner close");
			if (ob != null) {
				ob.close();
			}
		}
		System.out.println("Before");
	}// catch(Exception)

}

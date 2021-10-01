package com.siddhi.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner2 {

	public static void main(String[] args) {
		try (Scanner ob = new Scanner(System.in)) {
			int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int n1 = n[21];
		}

	}

}

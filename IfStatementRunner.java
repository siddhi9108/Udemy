package com.siddhi.ifStatement;

import java.util.Scanner;

public class IfStatementRunner {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = ob.nextInt();
		System.out.println("Enter y: ");
		int y = ob.nextInt();

		System.out.println("Choices available are: ");
		System.out.println("1 - add");
		System.out.println("2- sub");
		System.out.println("3 - divide");
		System.out.println("4 - mul");

		System.out.println("Enter your choice: ");
		int choice = ob.nextInt();

		if (choice == 1) {
			System.out.println(x + y);
		} else if (choice == 2) {
			System.out.println(x - y);
		} else if (choice == 3) {
			System.out.println(x / y);
		} else if (choice == 4) {
			System.out.println(x * y);
		}else {
			System.out.println("Invalid");
		}
	}

}

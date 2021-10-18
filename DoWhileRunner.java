package com.siddhi.loops;

import java.util.Scanner;

public class DoWhileRunner {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);

		long x = -1;
		do {
			if (x != -1) {
				System.out.println("Cube is: " + x * x * x);
			}
			System.out.println("Enter your number: ");
			x = ob.nextInt();
		} while (x >= 0);
		System.out.println("Have Fun!");
		ob.close();
	}

}
 
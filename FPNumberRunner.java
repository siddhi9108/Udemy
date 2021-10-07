package com.siddhi.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> ob = List.of(2, 3, 4, 5, 6778, 5, 4, 99);
		ob.stream().forEach(element -> System.out.println(element));

		int sum = fpSum(ob);

		// int sum = normalSum(ob);
		System.out.println(sum);
	}

	private static int fpSum(List<Integer> ob) {
		return ob.stream().filter(element -> element % 2 == 1).reduce(0, (num1, num2) -> {
			System.out.println(num1 + " " + num2);
			return num1 + num2;
		});
	}

	private static int normalSum(List<Integer> ob) {
		int sum = 0;
		for (int n : ob) {
			sum += n;// mutation
		}
		return sum;
	}

}

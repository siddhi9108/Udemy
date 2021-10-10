package com.siddhi.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void main(String[] args) {

		// public static void print(Integer num) {
		// System.out.println(num);
		// }

		List.of("Ant", "Bat", "Cat").stream().map(s -> s.length()).forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat").stream().map(s -> s.length()).forEach(System.out::println);

		// Integer max = List.of(23,11,76,44,33,34,5,6,33,4,7).stream()
		// .filter(null)
	}
}

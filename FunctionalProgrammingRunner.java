package com.siddhi.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Dog", "Cat");
		// printWithFP(list);
		printWithFPWithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for (String s : list) {
			System.out.println("element - " + s);
		}
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for (String s : list) {
			if(s.endsWith("at")) {
			System.out.println("element - " + s);
			}
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
		.forEach(element -> System.out.println(element));
	}
}

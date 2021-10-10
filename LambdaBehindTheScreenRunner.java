package com.siddhi.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}

class SysOut implements Consumer<Integer> {

	@Override
	public void accept(Integer n) {
		System.out.println(n);
	}

}

class NumSquare implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer x) {
		return x * x;
	}

}

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

		List.of(11, 23, 1, 2, 66, 45, 55, 34).stream().filter(evenPredicate).forEach(e -> System.out.println(e));
		List.of(11, 23, 1, 2, 66, 45, 55, 34).stream().filter(new EvenNumberPredicate()).forEach(new SysOut());
		List.of(11, 23, 1, 2, 66, 45, 55, 34).stream().filter(createEvenPredicate()).map(new NumSquare())
				.forEach(e -> System.out.println(e));
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

}

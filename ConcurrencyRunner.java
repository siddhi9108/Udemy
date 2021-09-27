package com.siddhi.concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter ob = new Counter();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		System.out.println(ob.getI());
	}

}

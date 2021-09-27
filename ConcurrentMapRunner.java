package com.siddhi.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> ob = new ConcurrentHashMap<>();

		String s = "ABCD ABCS ABCS";
		for (char ch : s.toCharArray()) {
			ob.computeIfAbsent(ch, cha -> new LongAdder())
			.increment();
			// LongAdder longAdder = ob.get(ch);
			// if (longAdder == null) {
			// longAdder = new LongAdder();
			// }
			// longAdder.increment();
			// ob.put(ch, longAdder);
		}
		System.out.println(ob);
	}

}

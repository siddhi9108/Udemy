package com.siddhi.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> l = new CopyOnWriteArrayList<>();

		// Threads - 3
		l.add("Siddhi");
		l.add("Prashant");
		l.add("Amilkanthwar");

		// Threads - 10000
		for (String e : l) {
			System.out.println(e);
		}
	}

}

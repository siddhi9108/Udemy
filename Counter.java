package com.siddhi.concurrency;

public class Counter {
	private int i = 0;

	public int getI() {
		return i;
	}

	synchronized public void increment() {
		i++;
	}  
}

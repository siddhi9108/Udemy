package com.siddhi.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	public int getI() {
		return i;
	}

	synchronized public void incrementI() {
		i++;
	}
	public int getJ() {
		return j;
	}

	synchronized public void incrementJ() {
		j++;
	}
}

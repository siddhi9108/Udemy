package com.siddhi.oops.level2;

public class Rectangle {
	// state
	private int w;
	private int l;

	// creation
	public Rectangle(int l, int w) {
		this.w = w;
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int area() {
		return l * w;
	}

	public int perimeter() {
		return 2 * (l + w);
	}

	// operation
	public String toString() {
		return String.format("l= %d,w= %d, area= %d, perimeter=%d", l, w, area(), perimeter());

	}

}

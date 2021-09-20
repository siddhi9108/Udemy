package com.siddhi.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan ob = new Fan("M1", 0.67, "purple");
		ob.switchOn();
		System.out.println(ob);
		ob.setSpeed((byte) 3);
		System.out.println(ob);
		ob.switchOff();
		System.out.println(ob);
	}
}

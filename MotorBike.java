package com.siddhi.oops;

public class MotorBike {// member var
	// state
	private int speed;
	
	MotorBike(){
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
		// System.out.println(speed);//100
		// System.out.println(this.speed);//0

	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	void start() {
		System.out.println("Bike started");
	}

}

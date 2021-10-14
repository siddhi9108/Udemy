package com.siddhi.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike BMW = new MotorBike(200);
		MotorBike ford = new MotorBike();
		
		System.out.println(BMW.getSpeed());
		System.out.println(ducati.getSpeed());
		System.out.println(ford.getSpeed());

		ducati.start();
		BMW.start();

		BMW.setSpeed(100);
		// int BMWSpeed = BMW.getSpeed();// get speed
		// BMWSpeed+=100;//increase by 100
		// BMW.setSpeed(BMWSpeed);// set it to BMW
		ducati.setSpeed(80);
		// int ducatiSpeed = ducati.getSpeed();// get speed
		// ducatiSpeed+=100;//increase by 100
		// ducati.setSpeed(ducatiSpeed);// set it to ducati
		// BMW.increaseSpeed(100);
		// ducati.increaseSpeed(100);
		// BMW.decreaseSpeed(10);
		// ducati.decreaseSpeed(10);
		System.out.println(BMW.getSpeed());
		System.out.println(ducati.getSpeed());

		// ducati.speed=0;
		// BMW.speed=50;
	}

}

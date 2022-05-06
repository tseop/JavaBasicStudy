package com.study.godofjava.chapter03;

public class Car {
	int speed;
	int distance;
	String color;

	public Car() {

	}

	public void speedUp() {
		speed++;
	}

	public void speedDown() {
		speed--;
	}

	public int currentSpeed() {
		return speed;
	}
}

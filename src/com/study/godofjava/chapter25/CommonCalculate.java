package com.study.godofjava.chapter25;

public class CommonCalculate {

	private int amount;
	Object lock = new Object();

	public CommonCalculate() {
		amount = 0;
	}

	public void plus(int value) {
		synchronized (lock) { // 매개변수에 this 예약어를 사용해도 되나 일반적으로는 Object 객체를 생성하여 사용한다.
			amount += value; 
		}
	}

	public void minus(int value) {
		amount -= value;
	}

	public int getAmount() {
		return amount;
	}
}

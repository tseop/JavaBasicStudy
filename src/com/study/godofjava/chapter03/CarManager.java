package com.study.godofjava.chapter03;

public class CarManager {
	public static void main(String[] args) {

		Car ACar = new Car(); // A car ����
		Car BCar = new Car(); // B car ����

		ACar.speedUp();
		BCar.speedUp();

		System.out.println(ACar.currentSpeed());
		System.out.println(BCar.currentSpeed());

	}
}

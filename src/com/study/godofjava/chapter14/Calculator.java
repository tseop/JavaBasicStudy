package com.study.godofjava.chapter14;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		try {
			cal.printDivide(1, 2);
			cal.printDivide(1, 0);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void printDivide(double d1, double d2) throws Exception {
		double result = d1 / d2;

		if (d2 == 0) {
			throw new Exception("Second value can't be Zero");

		}
		System.out.println(result);
	}
}

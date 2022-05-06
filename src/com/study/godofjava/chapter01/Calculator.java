package com.study.godofjava.chapter01;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int num1 = 2;
		int num2 = 1;

		System.out.println(cal.sum(num1, num2));
		System.out.println(cal.subtract(num1, num2));
		System.out.println(cal.multiply(num1, num2));
		System.out.println(cal.divide(num1, num2));

	}

	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}

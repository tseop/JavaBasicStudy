package com.study.godofjava.chapter03;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int num1 = 2;
		int num2 = 1;

		System.out.println("add : \t" + cal.add(num1, num2));
		System.out.println("subtract : \t" + cal.subtract(num1, num2));
		System.out.println("multiply : \t" + cal.multiply(num1, num2));
		System.out.println("divide : \t" + cal.divide(num1, num2));

	}

	public int add(int num1, int num2) {
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

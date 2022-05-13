package com.study.godofjava.chapter08;

public class MethodVarargs {
	public static void main(String[] args) {
		MethodVarargs mv = new MethodVarargs();
		mv.calculateNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
	}

	public void calculateNumbersWithArray(int[] numbers) {

	}

	public void calculateNumbers(int... numbers) { // 이런식으로도 선언이 가능하구나..

		int total = 0;
		for (int number : numbers) {
			total += number;
		}

		System.out.println("tatal : " + total);
	}

	public void arbitrary(String message, int... numbers) { // 한 메소드에 하나만 이렇게 선언이 가능하고 다른 매개변수 뒤에 붙여줘야한다.

	}
}

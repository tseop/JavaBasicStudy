package com.study.godofjava.chapter08;

public class MethodVarargs {
	public static void main(String[] args) {
		MethodVarargs mv = new MethodVarargs();
		mv.calculateNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
	}

	public void calculateNumbersWithArray(int[] numbers) {

	}

	public void calculateNumbers(int... numbers) { // �̷������ε� ������ �����ϱ���..

		int total = 0;
		for (int number : numbers) {
			total += number;
		}

		System.out.println("tatal : " + total);
	}

	public void arbitrary(String message, int... numbers) { // �� �޼ҵ忡 �ϳ��� �̷��� ������ �����ϰ� �ٸ� �Ű����� �ڿ� �ٿ�����Ѵ�.

	}
}

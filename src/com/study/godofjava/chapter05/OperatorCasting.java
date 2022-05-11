package com.study.godofjava.chapter05;

public class OperatorCasting {
	public static void main(String[] args) {
		OperatorCasting oc = new OperatorCasting();
		// oc.casting();
		int a = 3;
		int b = 1;
		System.out.println((a == 3) && (b == 1));
	}

	public void casting() {
		byte byteValue = 127;
		short shortValue = byteValue;

		shortValue++;
		System.out.println(shortValue);
		byteValue = (byte) shortValue;
		System.out.println(byteValue);
	}
}

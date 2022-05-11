package com.study.godofjava.chapter05;

public class OperatorComparision {

	public static void main(String[] args) {
		OperatorComparision oc = new OperatorComparision();
		oc.comparison2();
	}

	public void comparison() {
		int intValue1 = 1;
		int intValue2 = 2;
		int intValue3 = 1;

		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1 == intValue3);

		System.out.println(intValue1 != intValue2);
		System.out.println(intValue1 != intValue3);
	}

	public void comparison2() {
		char charValue = 'a';
		System.out.println(97==charValue);
		int intValue1 = 1;
		double doubleValue = 1.0;
		System.out.println(intValue1 == doubleValue);
	}
}

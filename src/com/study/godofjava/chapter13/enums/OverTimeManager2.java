package com.study.godofjava.chapter13.enums;

public class OverTimeManager2 {
	public static void main(String[] args) {
		OverTimeValues2 value = OverTimeValues2.FIVE_HOUR;
		System.out.println(value);
		System.out.println(value.getAmount());

		// �Ű������� ���� ���� �ʱ�ȭ�� ���� ���� ���̸� ����Ѵ�.
		System.out.println(value.compareTo(OverTimeValues2.WEEKEND_EIGHT_HOUR));
		
		OverTimeValues2[] array = value.values();
		for (int i = 0; i < array.length; i++) { // enum Ŭ���� �� ����� ���� ����Ѵ�.
			System.out.println(array[i]);
		}

	}
}

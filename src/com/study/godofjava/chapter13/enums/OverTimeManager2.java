package com.study.godofjava.chapter13.enums;

public class OverTimeManager2 {
	public static void main(String[] args) {
		OverTimeValues2 value = OverTimeValues2.FIVE_HOUR;
		System.out.println(value);
		System.out.println(value.getAmount());

		// 매개변수로 넣은 값과 초기화된 값의 순서 차이를 출력한다.
		System.out.println(value.compareTo(OverTimeValues2.WEEKEND_EIGHT_HOUR));
		
		OverTimeValues2[] array = value.values();
		for (int i = 0; i < array.length; i++) { // enum 클래스 내 선언된 값을 출력한다.
			System.out.println(array[i]);
		}

	}
}

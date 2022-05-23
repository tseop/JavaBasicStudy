package com.study.godofjava.chapter21.car;

import com.study.godofjava.chapter21.WildcardGeneric;

public class CarWildcardSample {
	public static void main(String[] args) {
		CarWildcardSample sample = new CarWildcardSample();
		sample.callBoundeWildcardMethod();

	}

	public void callBoundeWildcardMethod() {
		WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
		wildcard.setWildcard(new Bus("4650"));
		boundedWildcardMethod(wildcard);
	}

	// 제네릭으로 "? extends 타입" 타입을 객체로 지정해줄 경우 해당 객체를 상속받는 모든 클래스 타입으로 매개변수를 받을 수 있다.
	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
		Car value = c.getWildcard();
		System.out.println(value);
	}
}

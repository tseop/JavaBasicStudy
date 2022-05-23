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

	// ���׸����� "? extends Ÿ��" Ÿ���� ��ü�� �������� ��� �ش� ��ü�� ��ӹ޴� ��� Ŭ���� Ÿ������ �Ű������� ���� �� �ִ�.
	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
		Car value = c.getWildcard();
		System.out.println(value);
	}
}

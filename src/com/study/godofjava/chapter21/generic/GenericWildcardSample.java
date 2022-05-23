package com.study.godofjava.chapter21.generic;

import java.util.ArrayList;

import com.study.godofjava.chapter21.WildcardGeneric;
import com.study.godofjava.chapter21.car.Car;

public class GenericWildcardSample {
	public static void main(String[] args) {
		GenericWildcardSample sample = new GenericWildcardSample();
		sample.callMethod();

	}

	public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
		c.setWildcard(addValue);
		T value = c.getWildcard();
		System.out.println(value);
	}

	public void callMethod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
		genericMethod(wildcard, "Data");
	}

	/**
	 * �޼ҵ带 ���׸�Ÿ������ ��ȯ���� �ְ� �޴� ���� T�� �����Ͽ� Ÿ���� ����������..�� // �ñ����� ArrayList�� ��ȯ�� �ϴµ�
	 * ���ϵ�ī��� ���׸�Ÿ���� ������ �ϸ�... public <T> ArrayList<?> testMethod(T t) {
	 * ArrayList<T> result = new ArrayList<T>();
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * public void printArr() { WildcardGeneric<? extends Car> wildcard = new
	 * WildcardGeneric<>(); ArrayList<?> result = testMethod(wildcard);
	 * 
	 * for (int i = 0; i < result.size(); i++) { System.out.println("��� : " +
	 * result.get(i)); }
	 * 
	 * }
	 */

}

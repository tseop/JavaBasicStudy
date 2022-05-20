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
	 * 메소드를 제네릭타입으로 반환값을 주고 받는 값을 T로 지정하여 타입을 지정했을때..ㄴ // 궁금한점 ArrayList를 반환을 하는데
	 * 와일드카드로 제네릭타입을 선언을 하면... public <T> ArrayList<?> testMethod(T t) {
	 * ArrayList<T> result = new ArrayList<T>();
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 * public void printArr() { WildcardGeneric<? extends Car> wildcard = new
	 * WildcardGeneric<>(); ArrayList<?> result = testMethod(wildcard);
	 * 
	 * for (int i = 0; i < result.size(); i++) { System.out.println("결과 : " +
	 * result.get(i)); }
	 * 
	 * }
	 */

}

package com.study.godofjava.chapter29.generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {

	/**
	 * [Test] CastingGenericDTO Version : 1
	 */
	private static final long serialVersionUID = 1L;

	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	/*
	제네릭 타입의 이름 명명 기본 규칙
	- E : 요소, 자바 컬렉션에서 주로 사용됨
	- K : 키
	- V : 값
	- N : 숫자
	- T : 타입
	- S, U, V : 두번째, 세번째, 네번째 선언되는 타입

	제네릭 wildcard 타입
	- 제네릭 타입 제한을 해소하기 위해 특정타입을 명명하는게 아닌 ? 를 사용
	- 정확한 타입을 모르기에 해당 타입은 Object 를 통해 값을 받는다.

	- 와일드카드 제한 방법
		○ '? extends Car' 과 같이 Car 클래스나 상속받은 클래스만 오도록 제한이 가능

	제네릭한 메소드 선언
	- wildcard 사용 시 매개변수로넘어온 타입을 변경할 수 없음
	- 제네릭한 메소드 선언 시 타입 변경이 가능
		public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
			c.setWildcard(addValue);
			T value = c.getWildcard();
			System.out.println(value);
	 */

	}

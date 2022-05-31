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
	���׸� Ÿ���� �̸� ��� �⺻ ��Ģ
	- E : ���, �ڹ� �÷��ǿ��� �ַ� ����
	- K : Ű
	- V : ��
	- N : ����
	- T : Ÿ��
	- S, U, V : �ι�°, ����°, �׹�° ����Ǵ� Ÿ��

	���׸� wildcard Ÿ��
	- ���׸� Ÿ�� ������ �ؼ��ϱ� ���� Ư��Ÿ���� ����ϴ°� �ƴ� ? �� ���
	- ��Ȯ�� Ÿ���� �𸣱⿡ �ش� Ÿ���� Object �� ���� ���� �޴´�.

	- ���ϵ�ī�� ���� ���
		�� '? extends Car' �� ���� Car Ŭ������ ��ӹ��� Ŭ������ ������ ������ ����

	���׸��� �޼ҵ� ����
	- wildcard ��� �� �Ű������γѾ�� Ÿ���� ������ �� ����
	- ���׸��� �޼ҵ� ���� �� Ÿ�� ������ ����
		public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
			c.setWildcard(addValue);
			T value = c.getWildcard();
			System.out.println(value);
	 */

	}

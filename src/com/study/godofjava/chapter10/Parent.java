package com.study.godofjava.chapter10;

public class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}

	public void printName() {
		System.out.println("Parent printName()");
	}

	private void privateParent() { // ��ӹ��� Ŭ���������� �� �޼ҵ�� ����� ���� �ʴ´�.
		System.out.println("private parent method");
	}

}

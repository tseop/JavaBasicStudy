package com.study.godofjava.chapter10;

public class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}

	public void printName() {
		System.out.println("Parent printName()");
	}

	private void privateParent() { // 상속받은 클래스에서도 이 메소드는 사용이 되지 않는다.
		System.out.println("private parent method");
	}

}

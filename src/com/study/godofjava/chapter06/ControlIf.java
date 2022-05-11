package com.study.godofjava.chapter06;

public class ControlIf {
	public static void main(String[] args) {
		ControlIf control = new ControlIf();
		control.ifAndOr();

	}

	public void ifAndOr() {
		int age = 25;
		boolean isMarried = true;

		if (age > 25 && isMarried) {
			System.out.println("Age is over 25 and Married");
		}
		if (age > 25 || isMarried) {
			System.out.println("Age is over 25 or Married");
		}

	}

}

package com.study.godofjava.chapter06;

public class ControlElseIf {
	public static void main(String[] args) {
		ControlElseIf control = new ControlElseIf();
		control.elseIf(85);
	}

	public void elseIf(int point) {

		if (point > 90) {
			System.out.println("A");

		} else if (point > 80) {
			System.out.println("B");

		} else {
			System.out.println("F");
		}
	}
}

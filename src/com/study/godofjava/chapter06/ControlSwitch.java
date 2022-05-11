package com.study.godofjava.chapter06;

public class ControlSwitch {
	public static void main(String[] args) {
		ControlSwitch control = new ControlSwitch();
		control.switchStatement(1);
		control.switchStatement(2);
		control.switchStatement(3);
		control.switchStatement(4);
		control.switchStatement(5);
	}

	public void switchStatement(int numberOfWheel) {
		System.out.print("numberOfWheel : " + numberOfWheel + " |");
		switch (numberOfWheel) {
		case 1:
			System.out.println(" : It is one foot bicycle.");
			break;

		case 2:
			System.out.println(" : It is a motor cycle or bicycle.");
			break;

		case 3:
			System.out.println(" : It if a three wheel car.");
			break;

		case 4:
			System.out.println(" : It is a car.");
			break;

		default:
			System.out.println(" : It is an expensive car.");
			break;
		}
	}
}

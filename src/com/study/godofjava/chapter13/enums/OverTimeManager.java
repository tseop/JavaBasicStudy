package com.study.godofjava.chapter13.enums;

public class OverTimeManager {

	public static void main(String[] args) {
		OverTimeManager time = new OverTimeManager();
		int myAcount = time.getOverTimeAmount(OverTimeValues.FIVE_HOUR);
		System.out.println("Acount : " + myAcount);
	}

	public int getOverTimeAmount(OverTimeValues value) {
		int amount = 0;
		System.out.println("value : " + value);

		switch (value) {
		case THREE_HOUR:
			amount = 18000;
			break;

		case FIVE_HOUR:
			amount = 30000;
			break;

		case WEEKEND_FOUR_HOUR:
			amount = 40000;
			break;

		case WEEKEND_EIGHT_HOUR:
			amount = 60000;
			break;

		default:
			amount = 0;
			break;
		}

		return amount;
	}
}

package com.study.godofjava.chapter06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager manager = new InterestManager();

		for (int i = 5; i <= 365;) {
			System.out.println(i + "일차 자산 : " + manager.calculateAmount(i, 1000000, manager));
			i += 5;
		}

	}

	public double getInterestRate(int day) {
		double rate;
		if (day <= 90) {
			rate = 0.5;

		} else if (day <= 180) {
			rate = 1.0;

		} else if (day <= 364) {
			rate = 2.0;

		} else if (day >= 365) {
			rate = 5.6;

		} else {
			rate = 0;

		}

		rate = rate / 100;

		return rate;
	}

	public double calculateAmount(int day, long amount, InterestManager manager) {
		double rateMoney;
		double rate;

		rate = manager.getInterestRate(day);
		rateMoney = amount * rate;
		double money = amount + rateMoney;

		return money;
	}
}

package com.study.godofjava.chapter05;

import java.util.Scanner;

public class SalaryManager {
	public static final double TEX = 0.125;
	public static final double PENSION = 0.081;
	public static final double HEALTH_INSURANCE = 0.135;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		SalaryManager sm = new SalaryManager();

		int yearlySalary;
		double monthlySalary, realMonthlySalary;

		System.out.println("연봉을 입력하세요.");
		yearlySalary = sc.nextInt();
		
		monthlySalary = sm.getMonthlySalary(yearlySalary);
		realMonthlySalary = sm.realMonthlySalary(monthlySalary, sm);
		
		System.out.println("연봉 : " + yearlySalary + " 원\n");

		System.out.println("내야할 소득세 : " + sm.calculateTax(monthlySalary) + " 원");
		System.out.println("내야할 연금 : " + sm.calculateNationalPension(monthlySalary) + " 원");
		System.out.println("내야할 보험료 : " + sm.calculateHealthInsurance(monthlySalary) + " 원\n");

		System.out.println("공제 후 월급 : " + realMonthlySalary + " 원");

	}

	public double getMonthlySalary(int yearlySalary) {
		double monthlySalary = yearlySalary / 12.0;
		return monthlySalary;
	}

	public double calculateTax(double monthlySalary) {
		double monthlyTex = monthlySalary * TEX;
		return monthlyTex;
	}

	public double calculateNationalPension(double monthlySalary) {
		double monthlyNationalPension = monthlySalary * PENSION;
		return monthlyNationalPension;
	}

	public double calculateHealthInsurance(double monthlySalary) {
		double monthlyHealthInsurance = monthlySalary * HEALTH_INSURANCE;
		return monthlyHealthInsurance;
	}

	public double realMonthlySalary(double monthlySalary, SalaryManager sm) {
		return monthlySalary - sm.calculateHealthInsurance(monthlySalary) - sm.calculateTax(monthlySalary)
				- sm.calculateNationalPension(monthlySalary);

	}
}

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

		System.out.println("������ �Է��ϼ���.");
		yearlySalary = sc.nextInt();
		
		monthlySalary = sm.getMonthlySalary(yearlySalary);
		realMonthlySalary = sm.realMonthlySalary(monthlySalary, sm);
		
		System.out.println("���� : " + yearlySalary + " ��\n");

		System.out.println("������ �ҵ漼 : " + sm.calculateTax(monthlySalary) + " ��");
		System.out.println("������ ���� : " + sm.calculateNationalPension(monthlySalary) + " ��");
		System.out.println("������ ����� : " + sm.calculateHealthInsurance(monthlySalary) + " ��\n");

		System.out.println("���� �� ���� : " + realMonthlySalary + " ��");

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

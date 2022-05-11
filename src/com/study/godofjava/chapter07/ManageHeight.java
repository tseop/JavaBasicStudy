package com.study.godofjava.chapter07;

public class ManageHeight {
	public static void main(String[] args) {
		ManageHeight manage = new ManageHeight();
		manage.printHeight(10, manage);

	}

	public int[][] getHeights() {
		int[][] gradeHeights = { { 170, 180, 173, 175, 177 }, { 160, 165, 167, 186 }, { 158, 177, 187, 176 },
				{ 173, 182, 181 }, { 170, 180, 165, 177, 172 } };

		return gradeHeights;
	}

	public void printHeight(int classNo, ManageHeight manage) {
		if (classNo > 0 && classNo <= 5) {

			System.out.println("Class No. : " + classNo);
			classNo--;

			int[][] studentClass = manage.getHeights();
			for (int student : studentClass[classNo]) {
				System.out.println(student);
			}

		} else {
			System.out.println("현재 편성되어 있는 반은 " + manage.getHeights().length + "반까지 입니다.");
		}
	}

	public void printAll(ManageHeight manage) {
		int i = 1;

		for (int[] studentClass : manage.getHeights()) {
			System.out.println("Class No. : " + i);

			for (int student : studentClass) {
				System.out.println(student);
			}
			i++;
		}
	}

	public void printAverage(ManageHeight manage) {
		int[][] studentInfo = manage.getHeights();
		double average;

		for (int i = 0; i < studentInfo.length; i++) {
			average = 0;
			System.out.println("Class No. : " + (i + 1));

			for (int j = 0; j < studentInfo[i].length; j++) {
				average += studentInfo[i][j];
			}

			average /= studentInfo[i].length;
			System.out.println("Height average : " + average + "\n");

		}
	}
}

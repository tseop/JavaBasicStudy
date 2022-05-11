package com.study.godofjava.chapter07;

public class ArrayNewFor {
	public static void main(String[] args) {
		ArrayNewFor array = new ArrayNewFor();
		array.newFor2(2);

	}

	public void newFor() {
		int[] oneDim = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int date : oneDim) {
			System.out.println(date);
		}
	}

	public void newFor2(int choice) {
		int[][] twoDim = { { 1, 2, 3 }, { 4, 5, 6 } };

		if (choice == 1) {
			for (int i = 0; i < twoDim.length; i++) {
				for (int j = 0; j < twoDim[i].length; j++) {

					System.out.print("twoDim[");
					System.out.print(i);
					System.out.print("][");
					System.out.print(j);
					System.out.print("] = ");
					System.out.println(twoDim[i][j]);
				}
			}

		} else if (choice == 2) {
			for (int[] data : twoDim) {
				for (int resultData : data) {
					System.out.println(resultData);
				}
			}
		}

	}
}

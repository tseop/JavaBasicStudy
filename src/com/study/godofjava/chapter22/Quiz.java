package com.study.godofjava.chapter22;

import java.util.ArrayList;

public class Quiz {

	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static ArrayList<Integer> classList;

	public static void main(String[] args) {
		Quiz sample = new Quiz();
		sample.setHeight();
		sample.printHeight();
		sample.printAverage();
	}

	public void setHeight() {
		classList = new ArrayList<Integer>();
		classList.add(170);
		classList.add(180);
		classList.add(173);
		classList.add(175);
		classList.add(177);
		list.add(classList);

		classList = new ArrayList<Integer>();
		classList.add(160);
		classList.add(165);
		classList.add(167);
		classList.add(186);
		list.add(classList);

		classList = new ArrayList<Integer>();
		classList.add(158);
		classList.add(177);
		classList.add(187);
		classList.add(176);
		list.add(classList);

		classList = new ArrayList<Integer>();
		classList.add(173);
		classList.add(182);
		classList.add(181);
		list.add(classList);

		classList = new ArrayList<Integer>();
		classList.add(170);
		classList.add(180);
		classList.add(165);
		classList.add(177);
		classList.add(172);
		list.add(classList);

	}

	public void printHeight() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Class No. : " + (i + 1));
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.println(list.get(i).get(j));
			}
			System.out.println();
		}
	}

	public void printAverage() {
		for (int i = 0; i < list.size(); i++) {
			double avr = 0;
			System.out.println("Class No. : " + (i + 1));
			for (int j = 0; j < list.get(i).size(); j++) {
				avr += list.get(i).get(j);
			}

			avr = (double) avr / list.get(i).size();
			System.out.println("Height avr : " + avr + "\n");
		}
	}

}

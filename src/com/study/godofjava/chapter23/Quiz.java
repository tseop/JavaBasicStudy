package com.study.godofjava.chapter23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz {
	public static void main(String[] args) {
		Quiz sample = new Quiz();

		for (int i = 0; i < 10; i++) {
			Set<Integer> numbers = sample.getSixNumber();
			System.out.println(numbers);
		}
	}

	public Set<Integer> getSixNumber() {
		Set<Integer> numbers = new HashSet<Integer>();
		Random ran = new Random();

		while (numbers.size() < 6) {
			numbers.add(ran.nextInt(45));
		}

		return numbers;

	}
}

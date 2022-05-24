package com.study.godofjava.chapter23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Quiz {
	public static void main(String[] args) {
		Quiz sample = new Quiz();

		for (int i = 0; i < 10; i++) {
			Set<Integer> numbers = sample.getSixNumber();
			List<Integer> list = new ArrayList<>(numbers);

			list = sample.listSetSort(list);
			System.out.println(list);
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

	public List<Integer> listSetSort(List<Integer> list) {
		Collections.sort(list);
		return list;
	}
}

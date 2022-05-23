package com.study.godofjava.chapter23;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String[] cars = { "Tico", "Spmata", "BMW", "Benz", "Lexus", "Mustang", "Grandeure", "The Beetle", "Mini Cooper",
				"i30", "BMW", "Lexus", "Carnibal", "SM5", "SM7", "SM3", "Tico" };
		System.out.println(sample.getCarKinds(cars));
	}

	public int getCarKinds(String[] cars) {

		if (cars == null) {
			return 0;
		}

		Set<String> carSet = new HashSet<>();
		for (String car : cars) {
			carSet.add(car);
		}

		printCar(carSet);
		int result = carSet.size();
		return result;
	}

	public void printCar(Set<String> list) {
		for (String car : list) {
			System.out.println("car name is : " + car);
		}
	}
}

package com.study.godofjava.chapter24;

import java.util.HashMap;

public class MapSample {
	public static void main(String[] args) {
		MapSample sample = new MapSample();
		sample.checkHashMap();
	}

	public void checkHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "a");

		System.out.println(map.get("A"));
		System.out.println(map.get("B"));

		map.put("A", "b");
		System.out.println(map.get("A"));
	}
}

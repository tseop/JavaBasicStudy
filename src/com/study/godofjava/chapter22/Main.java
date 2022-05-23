package com.study.godofjava.chapter22;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Main test = new Main();
		test.checkArrayList7();
	}

	public void checkArrayList3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("0 ");
		list2.addAll(list);

		for (String data : list2) {
			System.out.println("list2 : " + data);
		}
	}

	public void checkArrayList5() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");

		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println("list " + i + " : " + list.get(i));
		}
	}

	public void checkArrayList6() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		String[] strList = list.toArray(new String[0]);
		System.out.println(strList[0]);
	}

	public void checkArrayList7() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		String[] tempArray = new String[5];
		String[] strList = list.toArray(tempArray);
		for (String temp : strList) {
			System.out.println(temp);
		}
	}

	public void safeArrayList() { // 스레드에 안전한 ArrayList 를 만드는 법
		List list = (List) Collections.synchronizedList(new ArrayList<String>());

	}
}

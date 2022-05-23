package com.study.godofjava.chapter23;

import java.util.LinkedList;

public class QueueSample {
	public static void main(String[] args) {
		QueueSample sample = new QueueSample();
		sample.checkLinkedList1();
	}

	public void checkLinkedList1() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.addFirst("B");
		System.out.println(list);

		list.offerFirst("C");
		System.out.println(list);

		list.addLast("D");
		System.out.println(list);

		list.offer("E");
		System.out.println(list);

		list.offerLast("F");
		System.out.println(list);

		list.push("G");
		System.out.println(list);

		list.add(0, "H");
		System.out.println(list);

		System.out.println("EX : " + list.set(0, "I"));
		System.out.println(list);

	}
}

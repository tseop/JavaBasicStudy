package com.study.godofjava.chapter22;

import java.util.Stack;

public class StackSample {
	public static void main(String[] args) {
		StackSample sample = new StackSample();
		sample.stackTest();
	}

	public void stackTest() {
		Stack<String> stack2 = new Stack<String>();
		stack2.push("A");
		stack2.push("B");
		stack2.push("C");
		stack2.push("D");

		System.out.println(stack2);

		System.out.println("������ �� : " + stack2.peek()); // ���� �����͸� �����´�.
		System.out.println("������ �� : " + stack2.pop()); // ���� �����͸� �����ϰ� ���� �����ش�.

		System.out.println(stack2);
	}
}

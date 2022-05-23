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

		System.out.println("맨위의 값 : " + stack2.peek()); // 맨위 데이터를 가져온다.
		System.out.println("삭제한 값 : " + stack2.pop()); // 맨위 데이터를 삭제하고 값을 보여준다.

		System.out.println(stack2);
	}
}

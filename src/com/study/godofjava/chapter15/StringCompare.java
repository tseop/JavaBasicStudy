package com.study.godofjava.chapter15;

public class StringCompare {

	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		sample.checkString();
		sample.checkEmpty("qdwdwq");

		System.out.println("test".equals("Test"));

	}

	public void checkString() { // ���鵵 ���̿� ���Եȴ�.
		String text = "You must know String class.";
		System.out.println("text Length is : " + text.length());

	}

	public void checkEmpty(String text) { // ���ڿ��� ����ִ°�?
		System.out.println("text Empty is : " + text.isEmpty());
	}
}

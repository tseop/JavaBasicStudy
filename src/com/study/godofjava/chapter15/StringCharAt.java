package com.study.godofjava.chapter15;

public class StringCharAt {
	public static void main(String[] args) {
		String str = "My name is taeseop";

		/// length�� ũ��� ù�ڸ��� 1���ʹ�.
		System.out.println(str.length());

		// charAt �� �����ϴ� �ε����� ù �ڸ��� 0���ʹ�.
		System.out.println(str.charAt(4));

		char[] dst = new char[10];

		/**
		 * getChars �� dst �迭�� str �� 2��°���� 5��° ������ 4������ ���� dst�迭 ���� �����ϴµ� ������ �Ű�������
		 * ��ġ�������� ���� �����ϴ� ���̴�.
		 */
		str.getChars(2, 5, dst, 2);
		System.out.println(dst);

		int intStr = str.codePointAt(5);
		char charStr = (char) intStr;
		System.out.println("intStr : " + intStr + " charStr : " + charStr);

		// char �迭�� ���� String ���� ��ȯ�Ѵ�.
		System.out.println("copyValueOf : " + String.copyValueOf(dst));

		char[] stringCharArr = str.toCharArray();
		System.out.println("toCharArray : " + stringCharArr);

		for (int i = 0; i < stringCharArr.length; i++) {
			System.out.println("toCharArray[" + i + "] : " + stringCharArr[i]);
		}

	}
}

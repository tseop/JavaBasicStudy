package com.study.godofjava.chapter15;

public class StringCharAt {
	public static void main(String[] args) {
		String str = "My name is taeseop";

		/// length의 크기는 첫자리가 1부터다.
		System.out.println(str.length());

		// charAt 이 추출하는 인덱스는 첫 자리가 0부터다.
		System.out.println(str.charAt(4));

		char[] dst = new char[10];

		/**
		 * getChars 는 dst 배열에 str 의 2번째부터 5번째 이전인 4까지의 값을 dst배열 값을 저장하는데 마지막 매개변수의
		 * 위치에서부터 값을 저장하는 것이다.
		 */
		str.getChars(2, 5, dst, 2);
		System.out.println(dst);

		int intStr = str.codePointAt(5);
		char charStr = (char) intStr;
		System.out.println("intStr : " + intStr + " charStr : " + charStr);

		// char 배열의 값을 String 으로 변환한다.
		System.out.println("copyValueOf : " + String.copyValueOf(dst));

		char[] stringCharArr = str.toCharArray();
		System.out.println("toCharArray : " + stringCharArr);

		for (int i = 0; i < stringCharArr.length; i++) {
			System.out.println("toCharArray[" + i + "] : " + stringCharArr[i]);
		}

	}
}

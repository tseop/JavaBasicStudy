package com.study.godofjava.chapter15;

public class Quiz {
	public static void main(String[] args) {
		String text = "The String class reoresebts character strings.";
		String[] textArr = text.split(" ");

		for (String data : textArr)
			System.out.println(data);

	}
}

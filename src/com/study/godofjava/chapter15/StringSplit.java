package com.study.godofjava.chapter15;

public class StringSplit {
	public static void main(String[] args) {
		String text = "Java technology is both a programming language and a platform";
		String[] splitArray = text.split(" ");

		for (String data : splitArray) {
			System.out.println(data);
		}
	}
}

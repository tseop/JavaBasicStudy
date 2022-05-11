package com.study.godofjava.chapter07;

public class ArrayMain {
	public static void main(String[] args) {
		if (args.length > 0) {
			for (String arg : args) {
				System.out.println(arg);

			}
		} else if (args.length == 0) {
			System.out.println("아무것도 없음");

		}
	}
}

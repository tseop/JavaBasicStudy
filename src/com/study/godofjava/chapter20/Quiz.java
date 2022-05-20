package com.study.godofjava.chapter20;

public class Quiz {
	public static void main(String[] args) {
		Quiz sample = new Quiz();
		String str = "qwdwqd";
		try {
			System.out.println(sample.parseLong(str));

		} catch (NumberFormatException e) {
			System.out.println("'" + str + "' is not a number");

		}
		sample.printOtherBase(10000000);

	}

	public long parseLong(String data) throws NumberFormatException {
		return Long.parseLong(data);
	}

	public void printOtherBase(long value) {
		System.out.println("Value : " + value);
		System.out.println("Binary : " + Long.toBinaryString(value));
		System.out.println("Hex : " + Long.toHexString(value));
		System.out.println("Octal : " + Long.toOctalString(value));
	}
}

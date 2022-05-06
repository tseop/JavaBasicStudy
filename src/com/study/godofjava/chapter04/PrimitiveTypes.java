package com.study.godofjava.chapter04;

public class PrimitiveTypes {
	public static void main(String[] args) {
		PrimitiveTypes pt = new PrimitiveTypes();
		pt.checkChar();
	}

	public void checkOthreTypes() {
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807L;

		System.out.println("shortMax : " + shortMax);
		System.out.println("intMax : " + intMax);
		System.out.println("longMax : " + longMax);
	}

	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("charMin : " + charMin);
		System.out.println("charMax : " + charMax);
	}
}

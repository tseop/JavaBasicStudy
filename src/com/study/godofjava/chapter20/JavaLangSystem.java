package com.study.godofjava.chapter20;

public class JavaLangSystem {
	public static void main(String[] args) {
		System.out.println("java.version : " + System.getProperty("java.version"));
		System.out.println("Java_HOME : " + System.getenv("JAVA_HOME"));
	}

	public void printNull() {
		Object object = null;
		System.out.println(object);
		System.out.println(object + " is null");
	}

	public void printStreamCheck() {
		byte b = 127;
		short s = 32767;
		System.out.println(b);
		System.out.println(s);
		printInt(b);
		printInt(s);
	}

	public void printInt(int value) {
		System.out.println(value);
	}
}

package com.study.godofjava.chapter08;

public class ReferenceOverloading {

	public static void main(String[] args) {
		ReferenceOverloading referenceOverloading = new ReferenceOverloading();
		byte byteData = 0;
		referenceOverloading.print(byteData);
		referenceOverloading.print(20);
		referenceOverloading.print("String");
		referenceOverloading.print("String", 10);

	}

	public void print(int data) {
		System.out.println("int data");
	}

	public void print(String data) {
		System.out.println("String data");
	}

	public void print(String stringData, int intData) {
		System.out.println("String data, int data");
	}

	public void print(byte data) {
		System.out.println("byte data");
	}

}

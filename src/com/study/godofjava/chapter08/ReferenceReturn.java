package com.study.godofjava.chapter08;

public class ReferenceReturn {
	public static void main(String[] args) {
		ReferenceReturn referenceReturn = new ReferenceReturn();
		referenceReturn.intReturn();
		referenceReturn.intArrayReturn();
		referenceReturn.stringReturn();
	}

	public int intReturn() {
		int returnInt = 0;
		return returnInt;
	}

	public int[] intArrayReturn() {
		int[] returnArray = new int[10];
		return returnArray;
	}

	public String stringReturn() {
		String returnString = "a";
		return returnString;

	}
}

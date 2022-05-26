package com.study.godofjava.chapter25;

public class ThreadTestMain {
	public static void main(String[] args) {
		EndlessThread et = new EndlessThread();
		NameCalcThread nct = new NameCalcThread("Seop", 100);
		nct.start();
	}
}

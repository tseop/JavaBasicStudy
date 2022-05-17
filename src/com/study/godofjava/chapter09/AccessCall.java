package com.study.godofjava.chapter09;

public class AccessCall {
	public static void main(String[] args) {
		AccessModifier ac = new AccessModifier();
		ac.publicMethod();
		ac.packagePrivateMethod();
		ac.protectedMethod();
		// ac.privateMethod();

	}
}

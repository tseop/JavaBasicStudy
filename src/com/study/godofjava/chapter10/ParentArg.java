package com.study.godofjava.chapter10;

public class ParentArg {

	public ParentArg(String name) {
		System.out.println("ParentArg(" + name + ") Constrctor");
	}

	public ParentArg() {
		System.out.println("ParentArg Nomal Constrctor");
	}

	public void printName() {
		System.out.println("printName() - ParentArg");
	}

}

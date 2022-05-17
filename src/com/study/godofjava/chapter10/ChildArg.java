package com.study.godofjava.chapter10;

public class ChildArg extends ParentArg {

	public ChildArg() {
		super("ChildArg");
		System.out.println("ChildArg Constructor");
	}

	public ChildArg(String name) {
		super();
		System.out.println("ChildArg Name Constructor");
	}
}

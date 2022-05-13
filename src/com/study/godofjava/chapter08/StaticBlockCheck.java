package com.study.godofjava.chapter08;

public class StaticBlockCheck {
	public static void main(String[] args) {
		StaticBlockCheck sbc = new StaticBlockCheck();
		sbc.makeStaticBlockObject();
	}

	public void makeStaticBlockObject() {

		System.out.println("--------------");
		System.out.println(StaticBlock.data);
		System.out.println("--------------");

		System.out.println("Creating block 1");
		StaticBlock sb = new StaticBlock();
		System.out.println("Create block 1");

		System.out.println("--------------");
		System.out.println(StaticBlock.getData());
		System.out.println("--------------");

		System.out.println("Creating block 2");
		StaticBlock sb2 = new StaticBlock();
		System.out.println("Create block 2");
		System.out.println("--------------");

	}
}

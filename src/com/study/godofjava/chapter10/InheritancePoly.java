package com.study.godofjava.chapter10;

public class InheritancePoly {

	public static void main(String[] args) {
		InheritancePoly ip = new InheritancePoly();
		ip.callPrintNames();

	}

	public void callPrintNames() {
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOter();

		parent1.printName();
		parent2.printName();
		parent3.printName();
	}
}

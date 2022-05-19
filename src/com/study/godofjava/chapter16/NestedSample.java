package com.study.godofjava.chapter16;

public class NestedSample {
	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNestedObhect();
	}

	public void makeStaticNestedObhect() {
		PublicClass.StaticNested staticNested = new PublicClass.StaticNested();
		System.out.println(staticNested.getValue());
	}
}

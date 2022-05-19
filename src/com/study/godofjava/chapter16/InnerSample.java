package com.study.godofjava.chapter16;

public class InnerSample {
	public static void main(String[] args) {
		InnerSample sample = new InnerSample();
		sample.makeInnerObject();
	}

	public void makeInnerObject() {
		OuterOfInner outer = new OuterOfInner();
		OuterOfInner.Inner inner = outer.new Inner();
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
}

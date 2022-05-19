package com.study.godofjava.chapter17;

import com.study.godofjava.chapter10.Parent;

public class AnnotationOverrider extends Parent {

	public static void main(String[] args) {
		AnnotationOverrider sample = new AnnotationOverrider();
		sample.noMoreUse();
	}

	@Override
	public void printName() {
		super.printName();
	}

	@Deprecated
	public void noMoreUse() {

	}
}

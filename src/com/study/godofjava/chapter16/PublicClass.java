package com.study.godofjava.chapter16;

public class PublicClass {
	static class StaticNested {
		private int value = 0;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

}

class JustNotPublicClass {

}
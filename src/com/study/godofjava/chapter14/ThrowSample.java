package com.study.godofjava.chapter14;

public class ThrowSample {
	public static void main(String[] args) {
		ThrowSample sample = new ThrowSample();

		for (int i = 0; i < 100; i++) {
			sample.throwException(i);

			try {
				sample.throwsException(i);

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	public void throwException(int number) {
		try {
			if (number > 12) {
				throw new Exception("Number is over than 12");
			}

			System.out.println("Number is : " + number);

		} catch (Exception e) {
			System.err.println(e);

		}

	}

	public void throwsException(int number) throws Exception {

		if (number > 12) {
			throw new Exception("Number is over than 12");
		}

		System.out.println("Number is : " + number);

	}
}

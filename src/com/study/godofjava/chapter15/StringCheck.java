package com.study.godofjava.chapter15;

public class StringCheck {
	public static void main(String[] args) {
		StringCheck sample = new StringCheck();
//		String[] addrs = { "서울시 구로구 신도림동", "경기도 성남시 분당구 정자동 개발 공장", "서울시 구로구 개봉동" };
//		sample.checkAddress(addrs);

		sample.checkIndexOf(sample.getText());
		System.out.println();
		sample.checkLastIndexOf(sample.getText());
	}

	public void checkAddress(String[] addresses) {
		int startCount = 0;
		int endCount = 0;
		int containsCount = 0;

		String startText = "서울시";
		String containsText = "구로";
		String endText = "동";
		for (String addr : addresses) {
			if (addr.startsWith(startText)) {
				startCount++;
			}
			if (addr.contains(containsText)) {
				containsCount++;
			}

			if (addr.endsWith(endText)) {
				endCount++;
			}
		}

		System.out.println("Starts with " + startText + " count is " + startCount);
		System.out.println("Contains with " + containsText + " count is " + containsCount);
		System.out.println("End with " + endText + " count is " + endCount);
	}

	public void checkIndexOf(String text) {
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));
	}

	public void checkLastIndexOf(String text) {
		System.out.println(text.lastIndexOf('a'));
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a', 20));
		System.out.println(text.lastIndexOf("a ", 20));
		System.out.println(text.lastIndexOf('z'));
	}

	public String getText() {
		return "Java technology is both a programming language and a platform";
	}

}

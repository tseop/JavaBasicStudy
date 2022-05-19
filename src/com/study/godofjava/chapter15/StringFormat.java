package com.study.godofjava.chapter15;

public class StringFormat {
	public static void main(String[] args) {
		String text = "제 이름은 %s 입니다. 지금까지 %d 권의 책을 썼고, 하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";
		String realText = String.format(text, "김태섭", 0, 10.5);
		System.out.println(realText);
	}
}

package com.study.godofjava.chapter15;

public class StringFormat {
	public static void main(String[] args) {
		String text = "�� �̸��� %s �Դϴ�. ���ݱ��� %d ���� å�� ���, �Ϸ翡 %f %%�� �ð��� å�� ���µ� �Ҿ��ϰ� �ֽ��ϴ�.";
		String realText = String.format(text, "���¼�", 0, 10.5);
		System.out.println(realText);
	}
}

package com.study.godofjava.chapter12;

public class Equals {
	public static void main(String[] args) {
		Equals object = new Equals();
		object.equalMethod();
	}

	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO();
		MemberDTO obj2 = new MemberDTO();

		obj1.setName("Sangmin");
		obj2.setName("Sangmin");

		if (obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");

		} else {
			System.out.println("obj1 and obj2 is different");

		}

		System.out.println("--------------");
		System.out.println("obj1 : " + obj1);
		System.out.println("obj1.toString() : " + obj1.toString());

		System.out.println("--------------");

		System.out.println("obj2 : " + obj2);
		System.out.println("obj2.toString() : " + obj2.toString());
		System.out.println("--------------");

		if (obj1.toString().equals(obj2.toString())) {
			System.out.println("obj1.toString and obj2.toString is equals same");

		} else {
			System.out.println("obj1.toString and obj2.toString is equals different");

		}

		System.out.println("--------------");

		if (obj1.equals(obj2)) { // 이 결과 값이 다른 이유는 equals 는 해시코드 값을 비교하기 때문이다.
			System.out.println("obj1 and obj2 is equals same");

		} else {
			System.out.println("obj1 and obj2 is equals different");

		}

	}
}

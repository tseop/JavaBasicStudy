package com.study.godofjava.chapter08;

public class Student {

	String name;
	String addr;
	String phone;
	String email;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String addr, String phone, String email) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.email = email;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", phone=" + phone + ", email=" + email + "]";
	}

}

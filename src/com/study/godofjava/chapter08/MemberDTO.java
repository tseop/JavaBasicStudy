package com.study.godofjava.chapter08;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String name) { // �̸��� �˰����� ���
		this.name = name;
	}

	public MemberDTO(String name, String phone) { // �̸��ϸ� �𸣰� ���� ���
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(String name, String phone, String email) { // ��� �˰����� ���
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

}

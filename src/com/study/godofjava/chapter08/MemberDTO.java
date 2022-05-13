package com.study.godofjava.chapter08;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String name) { // 이름만 알고있을 경우
		this.name = name;
	}

	public MemberDTO(String name, String phone) { // 이메일만 모르고 있을 경우
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(String name, String phone, String email) { // 모두 알고있을 경우
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

}

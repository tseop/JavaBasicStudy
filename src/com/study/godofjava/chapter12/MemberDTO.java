package com.study.godofjava.chapter12;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}

package com.study.godofjava.chapter04;

public class ProfilePrint {
	private String name;
	private byte age;
	private boolean isMarried;

	public static void main(String[] args) {
		ProfilePrint pp = new ProfilePrint();

		pp.setName("seop");
		pp.setAge((byte) 28);
		pp.setMarried(false);

		System.out.println(pp.toString());

	}

	@Override
	public String toString() {
		return "ProfilePrint [name=" + name + ", age=" + age + ", isMarried=" + isMarried + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

}

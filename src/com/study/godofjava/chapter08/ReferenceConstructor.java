package com.study.godofjava.chapter08;

public class ReferenceConstructor {

	public static void main(String[] args) {
		ReferenceConstructor reference = new ReferenceConstructor();

	}

	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("seop");
		MemberDTO dto3 = new MemberDTO("seop", "010-1234-5678");
		MemberDTO dto4 = new MemberDTO("seop", "010-1234-5678", "seop@git.com");
	}

}

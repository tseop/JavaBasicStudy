package com.study.godofjava.chapter13.service;

import com.study.godofjava.chapter13.model.MemberDTO;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(MemberDTO member);

	public abstract boolean removeMember(String name, String phone);

	public abstract boolean updateMember(MemberDTO member);

	public void printLog(String data) {
		System.out.println("Data : " + data);
	}

}

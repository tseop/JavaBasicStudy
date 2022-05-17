package com.study.godofjava.chapter12;

public class ToString {
	public static void main(String[] args) {
		ToString thisString = new ToString();
		thisString.toStringMethod(thisString);
		System.out.println("+++++++++++++++++++++");
		thisString.toStringMethod2();
	}

	public void toStringMethod(Object obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus " + obj);
	}

	public void toStringMethod2() {
		System.out.println(this);
		System.out.println(toString());
		System.out.println("plus " + this);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ToString class";
	}

}

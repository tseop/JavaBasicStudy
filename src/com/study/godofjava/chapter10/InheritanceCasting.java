package com.study.godofjava.chapter10;

public class InheritanceCasting {
	public static void main(String[] args) {
		InheritanceCasting ic = new InheritanceCasting();
		ic.objectCastArray();
	}

	public void objectCastArray() {
		ParentCasting[] parentArray = new ParentCasting[3];

		parentArray[0] = new ChildCasting();
		parentArray[1] = new ParentCasting();
		parentArray[2] = new ChildCasting();

		objectTypeCheck(parentArray);
	}

	@SuppressWarnings("unused")
	private void objectTypeCheck(ParentCasting[] parentArray) {
		for (ParentCasting tempParent : parentArray) {
			if (tempParent instanceof ChildCasting) {
				System.out.println("ChildCasting");

			} else {
				System.out.println("ParentCasting");
			}

		}
	}
}

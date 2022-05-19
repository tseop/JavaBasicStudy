package com.study.godofjava.chapter17;

@UserAnnotation(number = 0)
public class UserAnnotationSample {

	public UserAnnotationSample() {
		// TODO Auto-generated constructor stub
	}

	@UserAnnotation(number = 0)
	public static void main(String[] args) {
		UserAnnotationSample sample = new UserAnnotationSample();

	}

	@UserAnnotation(number = 1)
	public void annotationSample1() {

	}

	@UserAnnotation(number = 2, text = "Second")
	public void annotationSample2() {

	}

	@UserAnnotation(number = 3, text = "Three")
	public void annotationSample3() {

	}
}

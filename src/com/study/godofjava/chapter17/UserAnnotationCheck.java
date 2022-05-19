package com.study.godofjava.chapter17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
	public static void main(String[] args) {
		UserAnnotationCheck sample = new UserAnnotationCheck();
		sample.checkAnnotation(UserAnnotationSample.class);
	}

	public void checkAnnotation(Class<UserAnnotationSample> useClass) {
		Method[] methods = useClass.getDeclaredMethods();
		for (Method temp : methods) {

			UserAnnotation annotation = temp.getAnnotation(UserAnnotation.class);

			if (annotation != null) {
				int number = annotation.number();
				String text = annotation.text();
				System.out.println(
						"Annotation name : " + temp.getName() + "\nNumber : " + number + "\nText : " + text + "\n");

			} else {
				System.out.println("Annotation is null");
			}
		}
	}
}

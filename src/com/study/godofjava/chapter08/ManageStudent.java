package com.study.godofjava.chapter08;

public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent ms = new ManageStudent();
		Student[] students = null;
		students = ms.addStudent();

		for (Student student : students) {
			ms.printStudents(student);
		}

	}

	public Student[] addStudent() {
		Student[] students = new Student[3];

		students[0] = new Student("KIM");
		students[1] = new Student("LIM");
		students[2] = new Student("TS", "Seoul", "010-1234-5678", "tseop@git.com");

		return students;
	}

	public void printStudents(Student student) {
		System.out.println(student.toString());
	}
}

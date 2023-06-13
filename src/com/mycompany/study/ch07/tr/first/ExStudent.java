package com.mycompany.study.ch07.tr.first;

public class ExStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("abc", "123-123", 1, 2);
		student.name();
		System.out.println(student.ssn);
		System.out.println(student.no);
		System.out.println(student.num);
		student.name("qwe");
	}

}

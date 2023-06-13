package com.mycompany.study.ch07.tr.first;

public class Student extends People {

	public int no;
	
	public Student(String name, String ssn, int num, int no) {
		super(name, ssn, num);
		this.no = no;
	}
	@Override
	public void name() {
		System.out.println(name);
	}
	public void name(String name) {
		System.out.println(name);
	}
}

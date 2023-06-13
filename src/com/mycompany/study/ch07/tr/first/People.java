package com.mycompany.study.ch07.tr.first;

public abstract class People {

	public String name;
	public String ssn;
	public int num;
	
	public People(String name, String ssn, int num) {
		this.name = name;
		this.ssn = ssn;
		this.num = num;
	}
	
	public abstract void name();
	
}

package com.mycompany.study.ch06.tr.second;

public class Car {
	//field
	int engine;
	String name;
	String color;
	String company;

	
	Car(){
		
	}
	Car(String color){
		this.color = color;
	}
	Car(String name, String color, String company){
		this.name = name;
		this.color = color;
		this.company = company;
	}
	//method
	void go() {
		System.out.println("앞으로 이동합니다.");
	}
	
	void back() {
		System.out.println("뒤로 이동합니다.");
	}
}

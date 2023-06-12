package com.mycompany.study.ch06.sixth;

public class Television {

	public static String company = "LG";
	public static String model = "OLED";
	public static String companyModel = company + ":" + model;
	public static String info;
	
	//static block
	static {
		info = company + ":" + model;
		abc();
	//	efg();		static block안에는 static 함수와 변수만 사용 가능
	}
	
	public static void abc() {
		System.out.println("abc()");
	}
	
	public void efg() {
		System.out.println("efg()");
	}
}

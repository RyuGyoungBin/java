package com.mycompany.study.ch06.tr.third;

public class Arithmetic {
	
	 public int add(int a, int b) {
		 int add = a+b;
		 return add;
	 }
	 
	 public void EngName(String name) {
		 switch(name) {
		 case "장원영":
			 System.out.println("TONY");
			 break;
		default:
			System.out.println("who are you");
			break;
		 }
	 }
	 
	 public int taken() {
		 return 10000;
	 }
}

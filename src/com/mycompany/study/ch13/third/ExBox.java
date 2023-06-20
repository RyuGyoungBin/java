package com.mycompany.study.ch13.third;

public class ExBox {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		
		Box<Integer> box2 = Utill.boxing(100);
		Box<String> box3 = Utill.boxing("100");
	}

}

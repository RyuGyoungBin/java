package com.mycompany.study.ch06.third;

public class Arithmetic {
	//더하기 함수
	
	public int add(int a, int b) {
		int x = a+b;
		return x;
	}
	
	//빼기 함수
	public int minus(int a, int b) {
		int y = a-b;
		return y;
	}

	//곱하기 함수
	public int multi(int a, int b) {
		int z = a*b;
		return z;
	}
	
	//
	public String chName(String x) {
		String y = "Tony";
		return y;
	}
	
	void tolk(String x) {
		switch(x) {
		case "아이브":
			System.out.println("장원영은 너무 예뻐");
			break;
		default:
			System.out.println("다른 사람은 그냥 예뻐");
			break;
		}
	}
	
	public int money() {
		int y = 10000;
		System.out.println(y+"원을 주웠습니다.");
		return y;
	}
	
	
}

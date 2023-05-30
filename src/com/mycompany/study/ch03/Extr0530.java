package com.mycompany.study.ch03;

public class Extr0530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 연산자(+)
		String stringVal = "jdk";
		String stringVal2 = "11.1";
		
		String stringVal3 = stringVal + stringVal2;
		System.out.println("stringVal3 : " + stringVal3 + " : " + stringVal + " " + stringVal2);
		
		// 논리 부정 연산자(!)
		int val = 3;
		if (!(val == 2)) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		
		
		// 문자열 관련
		String stringVal4 = "Tony";
		String stringVal5 = "Tony";
		
		String stringVal6 = new String("Tony");
		
		if (stringVal4 == stringVal5) {
			System.out.println("true");
		}
		if (stringVal5 == stringVal6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// 논리 연산자
		int intVal = 85;
		if(intVal >= 85 && intVal < 90) {
			System.out.println("&& : ture");
		}
		if(intVal > 85 || intVal < 90) {
			System.out.println("|| : ture");
		}
		if(intVal > 85 ^ intVal < 90) {
			System.out.println("^ : ture");
		}
		// 대입 연산자( +=, -=, *=, ...)
		
		// 삼항 연산자 (조건식)? A : B
		
		// 비교 연산자 (==, !=, <, >, <=, >=)
		
		// 부호 연산자
		
		// 증감 연산자 (++, --)
	}

}

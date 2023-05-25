package com.mycompany.study.ch02;

public class ExChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A'; 		// 문자
		char c2 = 65; 		// 십진수
		char c3 = '\u0041';	//16진수
		//char c1_1 = "A";	//오류 : "않됨
		//char c1_2 = 'AA';	//요류 : 한글자만 됨
				 
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		char c4 = '가'; 		// 문자
		char c5 = 44032; 		// 십진수
		char c6 = '\uac00';	//16진수
				 
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		
		int uniCode = c1;
		System.out.println("uniCode : " + uniCode);
		
		int uniCode2 = c4;
		System.out.println("uniCode2 : " + uniCode2);
	}

}

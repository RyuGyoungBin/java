package com.mycompany.study.ch02;

public class ExBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선언
		boolean default1Ny;
		//초기화
		//변수명은 default1Ny 로 불리언 변수 선언 초기값은 true
		default1Ny = true;
		//변수명은 default2Ny 로 불리언 변수 선언 초기값은 false
		boolean default2Ny = false;
		
		if(default1Ny) {
			System.out.println("기본값입니다");
		} else {
			System.out.println("여분값입니다");
		}
	}

}

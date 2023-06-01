package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단 부터 출력되는 구구단 프로그램을 작성하시오
		
		for(int i=2; i < 10; i++) {
			for(int j=1; j<10;j++) {
				System.out.println(i+"X"+j+" = "+ i*j);
			}
			System.out.println("-----------");
		}
	}

}

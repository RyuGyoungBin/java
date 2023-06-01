package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지 더하는 프로그램 작성
		// 
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; 
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		// 11~50까지 짝수의 합을 구하시오
		
		sum = 0;
		
		for (int j = 11; j <= 50; j++) {
			if(j % 2 == 0) {
				sum += j;
			}
		}
		System.out.println("11부터 50까지 짝수의 합 : " + sum);
	}

}

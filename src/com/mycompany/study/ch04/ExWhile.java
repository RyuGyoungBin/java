package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 더하는 프로그램 작성
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}

package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 타입의 변수 2개 선언하고
		//두 정수가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시요
		
		int x = 2;
		int y = 0;
		
		if (!(x == 0 || y == 0)) {
			if (x > 0 && y > 0) {
				System.out.println("(" + x +", "+ y+")는 1사분면에 위치합니다");
			} else if (x < 0 && y > 0) {
				System.out.println("(" + x +", "+ y+")는 2사분면에 위치합니다");
			} else if (x < 0 && y < 0) {
				System.out.println("(" + x +", "+ y+")는 3사분면에 위치합니다");
			} else if (x > 0 && y < 0){
				System.out.println("(" + x +", "+ y+")는 4사분면에 위치합니다");
			}
		} else if (x == 0 && y == 0) {
			System.out.println("(" + x +", "+ y+")는 원점 위에 위치합니다");
		} else if (x == 0) {
			System.out.println("(" + x +", "+ y+")는 y축 위에 위치합니다");
		} else if (y == 0) {
			System.out.println("(" + x +", "+ y+")는 x축 위에 위치합니다");
		}
		
		
		int a = -2;
		int b = 0;
		
		if(a>0 && b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b>0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 && b!= 0) {
			System.out.println("(a,b)는 x축 위에 있습니다");
		} else if(a!=0 && b== 0) {
			System.out.println("(a,b)는 y축 위에 있습니다");
		} else {
			// a==0 & b==0
			System.out.println("(a,b)는 원점입니다.");
		}
	}

}

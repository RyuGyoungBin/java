package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최댓값, 최솟값을 구하는 프로그램을 작성하시요
		
		int x = -3;
		int y = 0;
		int z = -3;
		if (x != y && x != z && y !=z) {
			if (z > y && z > x) {
				if(y > x) {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "z : " + z + ", 최솟값 : " + "x : " + x);
				} else {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "z : " + z + ", 최솟값 : " + "y : " + y);
				}
			} else if (y > x && y > z) {
				if(x > z) {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "y : " + y + ", 최솟값 : " + "z : " + z);
				} else {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "y : " + y + ", 최솟값 : " + "x : " + x);
				}
			} else if (x > z && x > y) {
				if(y > z) {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "x : " + x + ", 최솟값 : " + "z : " + z);
				} else {
					System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "x : " + x + ", 최솟값 : " + "y : " + y);
				}
			}
			
		} else if (x == y && x != z) {
			if (x > z) {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "x : " + x  + ", "+ "y : " + y + ", 최솟값 : " + "z : " + z);
			} else {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "z : " + z + ", 최솟값 : " + "x : " + x  + ", "+ "y : " + y);
			}
		} else if (x ==z && x != y) {
			if (x > y) {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "x : " + x  + ", "+ "z : " + z + ", 최솟값 : " + "y : " + y);
			} else {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "y : " + y + ", 최솟값 : " + "x : " + x  + ", "+ "z : " + z);
			}
		} else if (y == z && y != x) {
			if (y > x) {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "y : " + y  + ", "+ "z : " + z + ", 최솟값 : " + "x : " + x);
			} else {
				System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "중 최댓값 : " + "x : " + x + ", 최솟값 : " + "y : " + y  + ", "+ "z : " + z);
			}
		} else {
			System.out.println("x : " + x + ", "+ "y : " + y + ", " + "z : " + z + "값이 모두 동일합니다");
		}
		
		
		
		int a = 2;
		int b = 3;
		int c = 1;
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
		
	}

}

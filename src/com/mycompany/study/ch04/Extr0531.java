package com.mycompany.study.ch04;

public class Extr0531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if - 학점 계산
		int cost = 91;
		
		if (cost >= 90) {
			if(cost >= 97) {
				System.out.println("당신의 학점은 A+입니다.");
			} else if (cost >= 93) {
				System.out.println("당신의 학점은 A입니다.");
			} else {
				System.out.println("당신의 학점은 A-입니다.");
			}
		} else if (cost >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if (cost >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if (cost >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
		//일반:1, 5%할인적용
		//브론즈:2 10%할인적용
		//실버:3 15%할인적용
		//골드:4 20%할인적용
		//플래티넘:5 2.7%할인적용
		
		int grade = 3;
		int sale = 12000;
		int discount = 0;
		
		if (grade == 1) {
			discount = (int)(sale * 0.95);
			System.out.println("정가 " + sale + "원인 일반등급은 할인가: " + discount +"원입니다");
		} else if (grade == 2) {
			discount = (int)(sale * 0.9);
			System.out.println("정가 " + sale + "원인 브론즈등급은 할인가: " + discount +"원입니다");
		} else if (grade == 3) {
			discount = (int)(sale * 0.85);
			System.out.println("정가 " + sale + "원인 실버등급은 할인가: " + discount +"원입니다");
		} else if (grade == 4) {
			discount = (int)(sale * 0.8);
			System.out.println("정가 " + sale + "원인 골드등급은 할인가: " + discount +"원입니다");
		} else if (grade == 5) {
			discount = (int)(sale * 0.973);
			System.out.println("정가 " + sale + "원인 플래티넘등급은 할인가: " + discount +"원입니다");
		} else {
			System.out.println("등급이 올바르지 않습니다");
		}
		
		//int 타입의 변수를 1개 선언하고
		//짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int a = 0;
		
		if (a != 0) {
			if(a % 2 == 0) {
				System.out.println(a + "는 짝수입니다");
			} else {
				System.out.println(a + "는 홀수입니다");
			}
		} else {
			System.out.println(a + "는 홀짝을 판단할수 없습니다");
		}
	}

}

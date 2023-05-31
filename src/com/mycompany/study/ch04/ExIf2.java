package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반:1, 5%할인적용
		//브론즈:2 10%할인적용
		//실버:3 15%할인적용
		//골드:4 20%할인적용
		//플래티넘:5 2.7%할인적용
		
		int grade = 5;
		int cost = 12000;
		int sale = 0;
		
		if (grade == 1) {
			sale = (int) (cost * 0.95);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + sale + "원 입니다.");
		} else if (grade == 2) {
			sale = (int) (cost * 0.9);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + sale + "원 입니다.");
		} else if (grade == 3) {
			sale = (int) (cost * 0.85);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + sale + "원 입니다.");
		} else if (grade == 4) {
			sale = (int) (cost * 0.8);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + sale + "원 입니다.");
		} else if (grade == 5) {
			sale = (int) (cost * 0.973);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + sale + "원 입니다.");
		}
		/*
		 * 
		 * if (grade == 1) { System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " +
		 * (cost-(cost/20)) + "원 입니다."); } else if (grade == 2) {
		 * System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (cost-(cost/10)) +
		 * "원 입니다."); } else if (grade == 3) { System.out.println("정가가 " + cost +
		 * "원인 실버 등급의 할인가는: " + (cost-(cost*15/100)) + "원 입니다."); } else if (grade == 4)
		 * { System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (cost-(cost/5)) +
		 * "원 입니다."); } else if (grade == 5) { System.out.println("정가가 " + cost +
		 * "원인 플래티넘 등급의 할인가는: " + (cost-(cost*2.7/100)) + "원 입니다."); }
		 */
	}

}

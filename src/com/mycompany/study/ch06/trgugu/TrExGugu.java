package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("정수를 입력하세요");
			int x = scanner.nextInt();
			
			if(x != 0) {
				System.out.println("선택된 정수 : "+x);
				TrGugu.gugu(x);
			} else {
				flag = false;
				System.out.println("0이 선택되어 종료됩니다.");
			}
		}
		
	}

}

package com.mycompany.study.ch05;

public class ExLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재까지 나온 번호와 중복이 되지 않아야 함
		//중복 숫자 제거
		//3연속 번호 불가
		//보너스 제외
		// 1  5  3
		int min = 1;
		int max = 45;
		int temp = 0;
		int random = (int)((Math.random()*(max - min)) + min);
		int random2 = (int)((Math.random()*(max - min)) + min);
		int random3 = (int)((Math.random()*(max - min)) + min);
		int random4 = (int)((Math.random()*(max - min)) + min);
		int random5 = (int)((Math.random()*(max - min)) + min);
		int random6 = (int)((Math.random()*(max - min)) + min);

		int[] lotto = {random, random2, random3, random4, random5, random6};
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
		// 정렬
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<i; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = temp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		
		
		
	}

}

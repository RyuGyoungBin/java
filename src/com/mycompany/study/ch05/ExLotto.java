package com.mycompany.study.ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재까지 나온 번호와 중복이 되지 않아야 함
		//중복 숫자 제거
		//3연속 번호 불가
		//보너스 제외
		
		// 중복제거
		int max = 45;
		int min = 1;
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)((Math.random()*(max - min)) + min);
			System.out.println(i +":"+lotto[i]);
			for(int j=0; j<i;j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)((Math.random()*(max - min)) + min);
				} else {
					
				}
			}
			//System.out.println(lotto[i]);
		}
		
		//3연속 번호 제거
		for(int i=0; i<lotto.length;i++) {
			for(int j=0; j<lotto.length;j++) {
				for(int k=0; k<lotto.length; k++) {
					if(lotto[i]+1 == lotto[j] && lotto[j]+1 == lotto[k]) {
						lotto[i] = (int)((Math.random()*(max - min)) + min);
						lotto[j] = (int)((Math.random()*(max - min)) + min);
						lotto[k] = (int)((Math.random()*(max - min)) + min);
					} else {
						
					}
				}
			}
			//System.out.println(lotto[i]);
		}
		
		// 정렬
		int temp = 0;
		for(int i=0; i<lotto.length; i++) { 
			for(int j=0; j<i; j++) { 
				if(lotto[i] < lotto[j]) { 
					temp = lotto[j]; 
					lotto[j] = lotto[i];
					lotto[i] = temp; 
					} 
				} 
			}
		
		
		
		String lottoString =Integer.toString(lotto[0])+"/"+Integer.toString(lotto[2])+"/"+Integer.toString(lotto[3])+"/"+Integer.toString(lotto[4])+"/"+Integer.toString(lotto[5]);

		
		
		
		
		for(int x=0; x<lotto.length; x++) {
			System.out.println(x+": "+lotto[x]);
			System.out.println(lottoString);
		}
		
		
	}

}

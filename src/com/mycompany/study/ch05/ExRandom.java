package com.mycompany.study.ch05;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 45;
		int random1 = (int)((Math.random()*(max - min)) + min);
		int random2 = (int)((Math.random()*(max - min)) + min);
		
		System.out.println("random : "+ random1);
		int val = 0;
		int val2 = 0;
		int sum = 0;
		
		val = random1;
		val2 = random2;
		sum = val + val2;
		System.out.println(val);
		System.out.println(val2);
		
		System.out.println("sum : "+sum);
		int[] lotto = new int[6];
		lotto[0] = 7;
		lotto[1] = 2;
		lotto[2] = 3;
		lotto[3] = 1;
		lotto[4] = 5;
		lotto[5] = 9;
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
			System.out.println(lotto[i]);
		}
	
		for(int x=0; x<lotto.length; x++) {
			System.out.println(x+": "+(int)lotto[x]);
		}
		//System.out.println(lotto[0]+1);
		//System.out.println(lotto[1]);
	}

}

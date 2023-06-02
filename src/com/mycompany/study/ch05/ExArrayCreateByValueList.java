package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] scoreEnglish; int scoreMath[];
		 * 
		 * String[] name; String name2[];
		 * 
		 * double[] total; double avg[];
		 * 
		 * char[] grade202301; char grade202302[];
		 * 
		 * boolean[] score; boolean score2[];
		 */
		
		int[] scoreChemistry = {100,99,98,97,96};
		//scoreChemistry[5] = 97;
		scoreChemistry[0] = 90;
		System.out.println(scoreChemistry[0]);
		String[] scoreStudent = {"가씨","나씨","다씨","라씨","마씨"};
		char[] scoreRank = {'A','B','C','D','F'};
	
		// 선언과 동시에 초기화
		//int[] scorePhysics;
		//scorePhysics = {100,99,98,97,96};
		/*
		 * int a = scoreChemistry.length; System.out.println(a);
		 * 
		 * for(int i=0; i <= 4; i++) { System.out.println(i+1+"번 : "+scoreChemistry[i]);
		 * }
		 * 
		 * int i = 0; while(i<=4) { System.out.println(i+1+"번 : "+scoreChemistry[i]);
		 * i++; } for(int bb:scoreChemistry) { System.out.println(bb); }
		 */
		int sum = 0;
		for(int j=0; j<scoreChemistry.length; j++) {
			sum += scoreChemistry[j];
		}
		System.out.println("총합 : " + sum + ", 평균 : " + sum/scoreChemistry.length);
		
		int j = 0;
		sum = 0;
		while (j < scoreChemistry.length) {
			sum += scoreChemistry[j];
			j++;
		}
		System.out.println("총합 : " + sum + ", 평균 : " + sum/scoreChemistry.length);
		sum=0;
		for(int cc:scoreChemistry) {
			sum += cc;
		}
		System.out.println("총합 : " + sum + ", 평균 : " + sum/scoreChemistry.length);
		
	}	

}

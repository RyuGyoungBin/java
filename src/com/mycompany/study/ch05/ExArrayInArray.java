package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{11,22,33},{44,55,66},{77,88,99},{10,20,30},{40,50,60}};
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				//System.out.print(score[i][j]);
				if(j==0) {
					sum += score[i][j];
					
				} else if (j == 1) {
					sum2 += score[i][j];
					
				} else {
					sum3 += score[i][j];
					
				}
			}

		}
		System.out.println("kor sum: "+sum+", avg: "+(double)sum/score.length);
		System.out.println("eng sum: "+sum2+", avg: "+(double)sum2/score.length);
		System.out.println("math sum: "+sum3+", avg: "+(double)sum3/score.length);
		
		sum=0;
		sum2=0;
		sum3=0;
		int sum4 = 0;
		int sum5 = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				if(i==0) {
					sum += score[i][j];
				} else if (i == 1) {
					sum2 += score[i][j];
				} else if (i == 2) {
					sum3 += score[i][j];
				} else if (i == 3) {
					sum4 += score[i][j];
				} else {
					sum5 += score[i][j];
				}
			}
		}
		System.out.println("1번 학생 sum: "+sum+", avg: "+(double)sum/score[0].length);
		System.out.println("2번 학생 sum: "+sum2+", avg: "+(double)sum2/score[1].length);
		System.out.println("3번 학생 sum: "+sum3+", avg: "+(double)sum3/score[2].length);
		System.out.println("4번 학생 sum: "+sum4+", avg: "+(double)sum4/score[3].length);
		System.out.println("5번 학생 sum: "+sum5+", avg: "+(double)sum5/score[4].length);
	}

}

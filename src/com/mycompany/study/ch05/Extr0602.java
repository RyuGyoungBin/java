package com.mycompany.study.ch05;

public class Extr0602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,99,98,97,96};
		String name[] = {"가","나","다","라","마"};
		
		for(int i=0;i<score.length; i++) {
			System.out.println(score[i]);
		}
		int i = 0;
		while (i<score.length) {
			System.out.println(score[i]);
			i++;
		}
		for(int aa:score) {
			System.out.println(aa);
		}
		
		int[] score2 = new int[5];
		
		score2[0] = 10;
		score2[1] = 20;
		score2[2] = 30;
		score2[3] = 40;
		score2[4] = 50;
		int sum = 0;
		
		for(int j=0; j<score2.length; j++) {
			sum += score2[j];
		}
		System.out.println(sum);
		
		int j=0;
		sum=0;
		while (j<score2.length) {
			sum += score2[j];
			j++;
		}
		System.out.println(sum);
		
		sum=0;
		for(int bb:score2) {
			sum += bb;
		}
		System.out.println(sum);
		
		
		int[][] score3 = {{99,88,77},{88,77,66},{66,55,44},{44,33,22},{22,11,99}};
		
		int[] sumScore = {0,0,0,0,0};
		
		for(int k=0; k<score3.length; k++) {
			for(int l=0; l<score3[k].length; l++) {
				if(k == 0) {
					sumScore[k] = sumScore[k] + score3[k][l];
				} else if(k == 1) {
					sumScore[k] = sumScore[k] + score3[k][l];
				} else if(k == 2) {
					sumScore[k] = sumScore[k] + score3[k][l];
				} else if(k == 3) {
					sumScore[k] = sumScore[k] + score3[k][l];
				} else if(k == 4) {
					sumScore[k] = sumScore[k] + score3[k][l];
				} else {
					sumScore[k] = sumScore[k] + score3[k][l];
				}
			}
		}
		
		for(int m=0; m<sumScore.length; m++) {
			System.out.println(m+"번째 학생의 총합: "+sumScore[m]+", 평균: "+(double)sumScore[m]/score3[m].length);
		}
		
		
		for(int x=1; x<=11; x++) {
			for(int y=1; y<=11; y++) {
				if(x==1 || x==11) {
					if(y==6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if(x==2 || x==10) {
					if(y==5 || y==7) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if(x==3 || x==9) {
					if(y==4 || y==8) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if(x==4 || x==8) {
					if(y==3 || y==9) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if(x==5 || x==7) {
					if(y==2 || y==10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if(x==6 || x==11) {
					if(y==1 || y==11) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		
		
		
		
	}

}

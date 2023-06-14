package com.mycompany.study.ch07.EX;

public class Computer extends Calculator {
	
	@Override
	public double param(int r) {
		double x;
		x = Constants.PAI_2 * r * r;
		return x;
	}
}

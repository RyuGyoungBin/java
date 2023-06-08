package com.mycompany.study.ch06.tr.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println("car.name : "+car.name);
		System.out.println("car.engine : "+car.engine);
		System.out.println("car.color : "+car.color);
		System.out.println("car.company : "+car.company);
		
		car.go();
		car.back();
	}

}

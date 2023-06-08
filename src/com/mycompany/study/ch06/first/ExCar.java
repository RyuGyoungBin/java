package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car = new Car();	//생성
		
		MP3 mp3 = new MP3();
		/*
		 * System.out.println("car.name : "+car.name);
		 * System.out.println("car.color : "+ car.color);
		 * System.out.println("car.engine : "+car.engine);
		 * System.out.println("car.company : "+car.company);
		 * 
		 * car.go(); car.back();
		 */
		
		mp3.car.go();
		
		System.out.println("mp3.volume : "+mp3.volume);
		System.out.println("mp3.name : "+mp3.name);
		System.out.println("mp3.company : "+mp3.company);
		mp3.volumeUp();
		System.out.println(mp3.car.name);
	}

}
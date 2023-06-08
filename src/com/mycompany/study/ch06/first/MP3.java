package com.mycompany.study.ch06.first;

public class MP3 {

	
	//field
	int volume = 3;
	String name ="MP3";
	String color = "화이트";
	String company = "삼성";
	
	//method
	 void volumeUp() {
		 if(volume < 10) {
			 volume++;
		 } else {
			 
		 }
		 System.out.println("volume : "+volume);
	 };
	 
	 void volumeDown() {
		 if(volume > 1) {
			 volume--;
		 } else {
			 
		 }
		 System.out.println("volume : "+volume);
	 }
	 
	 Car car = new Car();
	 
	 
	 
}

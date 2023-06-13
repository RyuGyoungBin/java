package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone{

	//child class
	
		//field
		String brand;
		
		//method
		void brandDmb() {
			powerOn();
			turnOffDmb();
			System.out.println("404");
		}
		
		
		void changeChannelDmb(int channel) { 
			this.channel = channel;
			System.out.println(channel + "번으로 바꿉니다."); 
		}
		 
		void turnOnDmb(int a) {
			
		}
	
}

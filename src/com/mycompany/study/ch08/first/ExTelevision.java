package com.mycompany.study.ch08.first;

public class ExTelevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//emoteControl remotecontrol = new RemoteControl();
		//인터페이스는 객체화 시킬수 없다
		/*
		 * Television television = new Television(); television.turnOn();
		 * television.turnOff(); RemoteControl.changeBattery();
		 * 실행은 가능하지만 올바르지 않다
		 */
		
		RemoteControl remotecontrol = new Television();
		remotecontrol.turnOn();
		remotecontrol.turnOff();
		remotecontrol.setVolume(4);
		
		RemoteControl remotecontrol1 = new SettopBox();
		remotecontrol1.turnOn();
		remotecontrol1.turnOff();
		remotecontrol1.setVolume(5);
		
	}

}

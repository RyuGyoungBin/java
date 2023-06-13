package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cellphone = new CellPhone();
		
		cellphone.powerOn();
		cellphone.powerOff();
		
		System.out.println("==================");

		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.changeChannelDmb(6);
		dmbCellPhone.turnOffDmb();
		
		System.out.println("==================");
		
		MobilePhone mobilephone = new MobilePhone();
		
		mobilephone.powerOn();
		mobilephone.turnOffDmb();
		mobilephone.changeChannelDmb(11);
		
		
	}

}

package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member memberq1 = new Member("가","q1","q1w2","123-123","q1@q1");
		Member memberq2 = new Member("나","q2","q1w2e3","345-345","q2@q2");
		Member memberq3 = new Member("다","q3","q1w2e3r4","678-678","q3@q3");
		members.add(memberq1);
		members.add(memberq2);
		members.add(memberq3);
		for(Member member:members) {
			System.out.print("member.name: "+member.name+" | ");
			System.out.print("member.ID: "+member.ID+" | ");
			System.out.print("member.PW: "+member.PW+" | ");
			System.out.print("member.TEL: "+member.TEL+" | ");
			System.out.println("member.email: "+member.email);
		}
		
		for(int i=0;i<members.size();i++) {
			System.out.print(members.get(i).name+" | ");
			System.out.print(members.get(i).ID+" | ");
			System.out.print(members.get(i).PW+" | ");
			System.out.print(members.get(i).TEL+" | ");
			System.out.println(members.get(i).email+" | ");
		}
		
	}
	
}

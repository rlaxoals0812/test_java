package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1 = new Member(1, "kim","seoul");
		Member m2 = new Member();
		m2.num=2;
		m2.name="해골";
		m2.addr="eds";
		m1.printinfo();
		m2.printinfo();
		
	}
}

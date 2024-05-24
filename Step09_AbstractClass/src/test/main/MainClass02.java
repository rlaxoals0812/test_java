package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		MainClass02.test();
		test();
		MainClass02.useString("문자열");
		
		MyWeapon ww = new MyWeapon();
		MainClass02.useWeapon(ww);
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	//static메소드 추가
	public static void test() {
		System.out.println("static test() 메소드 호출");
	}
	public static void useString(String msg) {
		System.out.println("전달받은 문자열:"+msg);
	}
}

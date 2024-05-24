package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스로 객체 생성이 가능할까
		//Remocon r1=new Remocon(); //단독 객체 생성 불가
		
		//인터페이스가 데이터 타입 역할이 가능할까
		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		
		String result = Remocon.COMPANY;
		
		int num = 10;
		num = 20;
		
		final int num2=10;
//		num2=20;/x
		//수정은 불가
		//final 안붙이면 값 변경 가능
		final String NICK = "kimgura";
//		NICK="monkey";//변경 x
		Remocon r3 = new MyRemocon();
		
//		r3=null;
//		r3=new MyRemocon();
		
	}
}

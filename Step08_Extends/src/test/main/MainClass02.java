package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 변수 타입 앞 선언 data type은
 * 안에 든 참조값의 사용설명서
 * .찍으면 명시된 기능만 사용가능
 * java의 모든 객체는 다형성을 가질 수 있음
 * 다형성은 type이 여러개
 */
public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		
		Phone p2 = new HandPhone();
		
		Object p3=new HandPhone();
	}
}

package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성, p3 지역변수에 넣기
		Object p3 = new HandPhone();
		//casting 연산자 이용 우측은 Phone type으로 인식
		Phone p2 = (Phone)p3;
		//casting 연산자 이용 우측은 HandPhone type으로 인식
		HandPhone p1 = (HandPhone)p3;
		
		p1.mobileCall();
	}
}

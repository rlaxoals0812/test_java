package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1 =new HandPhone();
		
		Phone p2 = p1;
		
		Object p3 = p1;
		
		//자식 개체의 참조값은 부모 타입 변수나 필드에 자연스럽게 담긴다
	}
}

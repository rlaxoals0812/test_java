package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass05 {
	public static void main(String[] args) {
		AndroidPhone p1 = new AndroidPhone();
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
		
		System.out.println("---------");
		HandPhone p2= new AndroidPhone();
		p2.takePicture();
		
		System.out.println("---------");
		HandPhone p3 = new HandPhone();
		//HandPhone객체를 생성해서 참조값을 지역변수에 담기
		//원래의 메소드 출력
		p3.takePicture();
		
	}
}

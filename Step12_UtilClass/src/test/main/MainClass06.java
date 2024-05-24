package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		 List<MemberDto> members = new ArrayList<>();
		 
		 MemberDto m1 = new MemberDto();
		 m1.setNum(1);
		 m1.setName("a");
		 m1.setAddr("kor");
		 
		 MemberDto m2 = new MemberDto(2,"b","jap");
		 MemberDto m3 = new MemberDto(3,"c","USA");
		 
		 members.add(m1);
		 members.add(m2);
		 members.add(m3);
		 
//		 for(int i=0;i<members.size();i++) {
//			 String info = String.format("번호:%d 이름:%s 주소:%s",i,, "노량진");
//			 System.out.println(info);
//		 }
		 /*
		  * String클래스의 format이라는 static 메소드를 이용하면
		  * 원하는 문자열 형식을 좀 더 간편하게 얻어낼 수있다
		  * 
		  * %d:숫자(정수)를 출력
		  * %s:문자출력
		  * %f:실수
		  * %b:boolean
		  * %%:%자체출력
		  */
		 for(MemberDto tmp:members) {
			 String info = String.format
					 ("번호:%d 이름:%s 주소:%s",tmp.getNum(), tmp.getName(), tmp.getAddr());
			 System.out.println(info);
		 }
//		 test();
//		 test("hi");
//		 test("hi","hello");
//		 test("hi","hello","bye");
	}
	public static void test(String... msg) {
		for(String tmp:msg) {
			System.out.println(tmp);
		}
	 }
}

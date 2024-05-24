package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		
		Member m1 = new Member(1,"a","kor");
		Member m2 = new Member(2,"b","jap");
		Member m3 = new Member(3,"c","USA");
		
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		for(int i=0;i<members.size();i++) {
			Member tmp = members.get(i);
			System.out.println("번호: "+tmp.num+" 이름: "+tmp.name+" 주소: "+tmp.addr);
			
		}
		for(Member tmp:members) {
			String info = "번호: "+tmp.num+" 이름: "+tmp.name+" 주소: "+tmp.addr;
			System.out.println(info);
		}
	}
}

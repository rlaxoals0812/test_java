package test.main;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		
		mem1.num=1;
		mem1.name="kimgura";
		mem1.addr="노량진";
		
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="관짝";
		
		mem3.num=3;
		mem3.name="원숭이";
		mem3.addr="동물원";
		
		mem1.showInfo();
		mem2.showInfo();
		mem3.showInfo();
		
	}
}

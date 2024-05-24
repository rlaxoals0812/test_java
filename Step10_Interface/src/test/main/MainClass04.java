package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥구멍뚫기");
			}
		});
		useDrill(()->{
			System.out.println("천장 구멍 뚫기");
		});
		useDrill(()->{
			System.out.println("한번 더 뚫기");
		});
	}
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
		d.hole();
	}
}

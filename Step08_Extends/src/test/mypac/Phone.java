package test.mypac;

public class Phone extends Object{//extends 없으면 자동 extends object
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	public void call() {
		System.out.println("전화를 걸어요");
	}
}

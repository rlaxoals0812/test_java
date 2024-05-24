package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * class예약어 앞에 abstract를 명시해서 클래스를 정의한다
 * 형태만정의되고 실제 구현은 되지 않은 메소드가 존재 할 수 있다
 * 형태만 정의된 메소드를 만들 때는 abstract 예약어를 붙여 메소드 정의
 * 추상클래스 타입의 참조갑이 필요하면 추상클래스를 상속받은 자식클래스를 정의해서 객체 생성
 * 추상클래스를 상속받은 자식 클래스는 부모의 추상메소드를 모두 오버라이드 해야함
 */
public class MainClass01 {
 public static void main(String[] args) {
	 Weapon w1 = null;
	 
	 Weapon w2 = new MyWeapon();
	 w2.prepare();
	 w2.attack();
	 
 }
}

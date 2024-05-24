package test.mypac;

public abstract class Weapon {
	public void prepare() {
		System.out.println("무기작동을 준비합니다");
	}
	public abstract void attack();//추상메소드
}

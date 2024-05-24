package test.main;

import test.mypac.Weapon;


public class MainClass05 {
	
	static class seaWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("바다 적 공격");
		}
	}
	public static void main(String[] args) {
		Weapon w1 = new seaWeapon();
		w1.attack();
		
		class SpaceWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("우주 적 공격");
			}
		}
		Weapon w2 = new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}
}

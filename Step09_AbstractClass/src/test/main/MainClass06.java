package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("where is target");
			}
		});
		
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
	}
}

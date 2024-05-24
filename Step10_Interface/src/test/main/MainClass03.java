package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("volumm up");
			}

			@Override
			public void down() {
				System.out.println("volumm down");
			}
			
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("grade up");
			}
			
			@Override
			public void down() {
				System.out.println("grade down");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}

package test.mypac;

public class Zoo {
//	클래스 안에 클래스 정의하기
	public class Monkey{
		public void say() {
			System.out.println("hello im monkey");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("어흥");
		}
	}
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}

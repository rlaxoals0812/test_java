package test.main;

public class MainClass04 {
	//static메소드 안에서 사용하기 위해선 static예약어 필요함
	public static class Gura{
		public void say() {
			System.out.println("hi im gura");
		}
	}
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		//메소드 안에도 클래스를 정의 가능
		//여기 정의한 클래스는 메소드 안쪽에서만 사용 가능
		class Cat{
			public void say() {
				System.out.println("meow");
			}
		}
		Cat c1 = new Cat();
		c1.say();
	}
}

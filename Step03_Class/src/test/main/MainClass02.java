package test.main;
import test.mypac.Car;
public class MainClass02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car car2 = new Car();
		
		car1.name = "소나타";
		car2.name = "그렌저";
		car1.price = 31870000;
		car2.price = 35800000;
		
		boolean reault = car1 == car2;
		
		//car2에 들은 값의 참조값을 car3라는 지역변수에 담음
		Car car3=car2;
		car3.drive();
		boolean result2 = car2 == car3;
		
		
		car1.drive();
		car2.drive();
	}
}

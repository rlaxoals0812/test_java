package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		new Car();
	
		new Car().drive();
		
		Car c1=new Car();
		c1.name = "벤츠";
		c1.drive();
		
		Car c2=c1;
		c2.drive();
	}
}

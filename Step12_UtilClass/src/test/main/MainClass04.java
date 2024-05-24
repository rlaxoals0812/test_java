package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		Car c1=new Car("소나타");
		
		cars.add(c1);
		cars.add(new Car("프라이드"));
		cars.add(new Car("그렌저"));
		
		for(int i=0;i<cars.size();i++) {
			Car tmp = cars.get(i);
			tmp.drive();
		}
		for(Car tmp:cars) {
			tmp.drive();
		}
		Consumer<Car> con = new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();
				
			}
		};
		cars.forEach(con);
		
		cars.forEach((con2)->{
			con2.drive();
		});
	}
}

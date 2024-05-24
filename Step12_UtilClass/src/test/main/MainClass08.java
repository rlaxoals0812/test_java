package test.main;

import java.util.HashMap;
import java.util.Map;

import test.mypac.Car;

public class MainClass08 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name", "taemin");
		map1.put("isMan", true);
		map1.put("car", new Car("소나타"));
		
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		Car car = (Car)map1.get("car");
		
		map1.put("name", "acorn");
		
		map1.remove("isMan");
		
		map1.clear();
	}
}

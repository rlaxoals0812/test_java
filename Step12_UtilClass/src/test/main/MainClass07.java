package test.main;

import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * HashMap<Key type, value type>
		 * key type은 일반저으로 String type을 가장 많이 사용함
		 * value type은 담고 싶은 데이터의 type을 고려해서 지정하면 된다
		 * value type을 Object로 지정하면 어떤 data type이던지 다 담을 수가 있다
		 * 순서가 없는 데이터를 다룰 때 사용하면 된다
		 * dto 클래스 대신에 사용하기도 한다
		 * 
		 */
		HashMap<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "taemin");
		map.put("isMan", true);
		
		int num = (int)map.get("num");
		String name =(String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
		
		/*
		 * 윗 7줄을 js로 표현하면 다음과 같음
		 * 
		 * let map = {};
		 * map.num = 1;
		 * map.name = "taemin";
		 * map.isMan = true;
		 * 
		 * let num=map.num;
		 * let name=map.name;
		 * let isMan=map.isMan;
		 * 
		 * 아래의 코드도 가능함
		 * 
		 * let map={};
		 * map["num"] =1;
		 * map["name"] = "taemin";
		 * map["isMan"] = true;
		 * 
		 * let num = map["num'];
		 * let name = map["name"];
		 * let isMan = map["isMan"];
		 * 
		 * 
		 */
	}
}

package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("num",1);
		map1.put("name","김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("num",2);
		map2.put("name","skul");
		map2.put("addr", "grave");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("num",3);
		map3.put("name","taemin");
		map3.put("addr", "dongtan");
			
		List<Map<String, Object>> members = new ArrayList<>();
		
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		for(Map<String, Object> tmp:members) {
			String info = String.format("number:%d 이름:%s 주소:%s ",
					(int)tmp.get("num"), (String)tmp.get("name"), (String)tmp.get("addr"));
			System.out.println(info);
		}
		
	}
}

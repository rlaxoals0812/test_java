package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet은 Set인터페이스를 구현한 클래스임
 * 
 * 순서 없음
 * 키값 없음
 * 중복 안됨
 * 어떤 데이터를 집합으로 관리하고자 할 때 사용
 */
public class MainClass10 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		
		set1.forEach((item)->{
			System.out.println(item);
		});
		
		System.out.println("-----");
		
		set2.forEach((item)->{
			System.out.println(item);
		});
		
		boolean isContain = set2.contains("lee");
		
		int size = set2.size();
		
		set2.remove("park");
		
		set2.clear();
	}
}

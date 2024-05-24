package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		for(int i = 0; i < nums.size(); i++) {
			int tmp=nums.get(i);
			System.out.println(tmp);
		}
		System.out.println("확장 for문 활용");
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}
}

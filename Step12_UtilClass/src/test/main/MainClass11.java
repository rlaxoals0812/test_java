package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		//중복이 가능
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//List는 Collection type이기도 함
		Collection<Integer> nums2 = nums;
		//HashSet 객체의 생성자에 ArrayList(Collection) 을 전달해서 중복을 제거할 수 있다
		Set<Integer> set = new HashSet<>(nums);
		//중복 제거됨
		List<Integer> result =new ArrayList<>(set);
		//저장된 숫자 오름차순 정렬
		Collections.sort(result);
		//내림차순 정렬
		Collections.sort(result, Collections.reverseOrder());
		
		
	}
}

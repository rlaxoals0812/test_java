package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();	
		
		while(true) {
			Random r1 = new Random();
			int ranNum = r1.nextInt(45)+1;
			set1.add(ranNum);
			if(set1.size()==6) {
				break;
			}
		}
		List<Integer> nums = new ArrayList<Integer>(set1);
		Collections.sort(nums);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
	}
}

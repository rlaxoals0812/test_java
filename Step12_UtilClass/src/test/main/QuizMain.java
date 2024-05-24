package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Random r1 = new Random();
			int ranNum = r1.nextInt(100)+1;
			nums.add(ranNum);
		}
		Set<Integer> set = new HashSet<>(nums);
		List<Integer> result =new ArrayList<>(set);
		Collections.sort(result);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}

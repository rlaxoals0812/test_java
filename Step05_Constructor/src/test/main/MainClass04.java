package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int ranNum =ran.nextInt();	
		System.out.println(ranNum);
		int ranNum2=ran.nextInt(10);
		System.out.println(ranNum2);
		
	}
}

package test.main;

import java.util.Random;

import test.mypac.wowException;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = ran.nextInt(10);
		
		if(ranNum == 7) {
			//여기서 발생하는 Exception은 JVM이 직접 처리
			throw new wowException("wow that so awesome");
		}
		System.out.println(ranNum+" 나옴");
	}
}

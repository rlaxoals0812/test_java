package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("insert number");
		
		String inputNum = scan.nextLine();
		
		double num = Double.parseDouble(inputNum);
		
		double result = num+100;
		System.out.println("inserted number + 100 :"+result);
		System.out.println("무언가 중요한 마무리 작업을 하고 메인메소드가 종료됩니다");
		
	}
}	

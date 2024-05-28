package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력");
		String inputNum1 = scan.nextLine();
		
		System.out.println("나누어 지는 수 입력");
		String inputNum2 = scan.nextLine();
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result = num2/num1;
			int result2 = num2%num1;
			System.out.println(num2+"를"+num1+"로 나눈 몫"+result);
			System.out.println(num2+"를"+num1+"로 나눈 나머지"+result2);
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("main method 종료");
	}
}

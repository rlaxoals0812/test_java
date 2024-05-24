package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc c1 = null;
		
		Calc c2 = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				return 0;
			}
		};
		//인터페이스 type의 참조값을 함수모양으롱 얻어내기
		//매개변수의 타입은 선언할 필요 없음, 매개변수의 개수만 맞으면 됨
		Calc c3 = (a,b)->{
			return 0;
		};
		Calc add =(num1,num2)->{
			return num1+num2;
		};
		//매개변수로 전달한 두 수의 합이 리턴된다
		double result1 = add.execute(10, 20);
		//중괄호 안에서 따로 실행할 코드가 없다면 중괄호 생략
		//리턴 예약어 생략 후 리턴 값만 명시하면 됨
		Calc add2 = (num1,num2)->num1+num2;//한줄짜리 함수모양을 람다식 이라함
		
		Calc sub = (num1,num2)->num1-num2;
		Calc mul = (num1,num2)->num1*num2;
		Calc div = (num1, num2)->num1/num2;
		
		double result2 = sub.execute(100,1); 
		double result3 = mul.execute(2,8);
		double result4 = div.execute(10,2);
		
		
		
	}
}

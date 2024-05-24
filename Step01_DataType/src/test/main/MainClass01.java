package test.main;

import javax.swing.text.Document;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		byte iByte=10;
		short iShort = 500;
		int iInt=1000;
		long iLong=10000;
//		int type변수에 short type변수를 대입한다면
//		범위가 좁은변수 -> 큰 변수 문제 x
//		반대 경우 casting 필요
//		int num, num2, num3;
//		String str = "123";
//		Integer.parseInt(str);
		
		int tmp = iShort;
		byte tmp2 = (byte)iShort;
		
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3;
		float tmp4=(float)num2;
		//d를 안붙이면 double 타입 간주/double -> float casting 필요
//		System.out.println(str);
	}
}

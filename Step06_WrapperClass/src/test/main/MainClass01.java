package test.main;
/*
 * 기본 데이타 타입의 참조 데이타 타입
 * 
 * byte:Byte
 * short:Short
 * int:Integer
 * long:Long
 * 
 * float:Float
 * double:Double
 * 
 * char:Character
 * boolean:Boolean
 * 때로는 기본데이터 타입의 참조데이터 타입이 필요할 때가 있음
 * 기본데이터 타입을 객체에 포장(boxing)하는 형태
 * boxing과 unboxing은 자동으로 되기 때문에 신경 x
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
//		Integer num2=new Integer(10);
		Integer num2=10;
		
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		String result=num2.toString();
		int result4 = Integer.parseInt("999");
		
		
	}
}

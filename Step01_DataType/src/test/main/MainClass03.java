package test.main;
//논리형 
//true/false 직접 쓰거나 비교,논리 연산의 결과로 얻어낼 수 있음
//참과 거짓을 나타내는 data type
public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun=true;
		
		if(isRun) {
			System.out.println("run");
		}
//		비교 연산
		boolean isGreater=10>1;
//		논리연산
		boolean result=true||false;
//		재선언불가
//		boolean result=false; > x
		result = false; //변수에 다른 값 대입 가능(동일 type)
//		다른 type값은 불가
//		result=10; > x
		
	}
}

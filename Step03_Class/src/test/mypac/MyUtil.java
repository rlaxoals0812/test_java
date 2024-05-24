package test.mypac;
/*
 * [static]
 * 
 * ststic예약어를 붙여서 필드나 메소드를 정의하면 클래스와 함께 static 영역에 만들어 진다
 * static필드나 메소드를 사용할 때는 클래스명에 .찍어서 사용하면 된다
 * 
 * MyUtil.version // static 필드 참조
 * MyUtil.send() // static메소드 호출
 */
public class MyUtil {
	//data type 앞에 static붙여서 필드 생성 가능
	//필드는 선언시에 초기값을 넣어줄 수 있음
	public static String version="1.0";
	
	public static void send() {
		System.out.println("전송합니다.");
	}

	public static void clear() {
		System.out.println("asdads");
	}

	public static void light() {
		System.out.println("asdasd");
	}
}

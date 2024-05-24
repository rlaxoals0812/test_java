package test.auto;
/*
 * 접근 지정자 접근 범위
 * 
 * public 어디서나 접근 가능
 * protected 동일한 패키지 또는 상속관계에서만
 * default(작성x) 동일한 패키지만
 * private 동일 클래스 또는 동일 객체만
 * 
 * 접근지정자를 붙이는 위치
 * 1. 클래스 선언할 때(import 가능여부 결정)
 * 2. 생성자(객체 생성 가능여부 결정)
 * 3. 필드(필드참조 가능 여부 결정)
 * 4. 메소드(메소드 호출 가능 여부 결정)
 * 
 * 클래스는 default와 public두가지의 접근 지정자만 지정 가능
 * 접근지정자를 생략한것이 default
 */
public class Car {
	//필드 protected는 패키지가 달라도 상속관계 자식이면 참조 가능
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자( 이 생성자를 정의하면 default 생성자는 사라진다 )
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없어요!");
			return; //메소드를 여기서 리턴시키기(종료 시키기)
		}
		System.out.println("달려요~");
	}	
}
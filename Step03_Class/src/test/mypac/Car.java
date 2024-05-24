package test.mypac;
/* class의 역할
 * 1. 객체의 설계도 역할
 * 객체는 heap영역에 들어있는 물건이라 생각,
 * class를 이용하여 객체를 원하는 시점에 원하는 개수만큼 만들어 낼 수 있다
 * 만들어지 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설계 할 수 있다
 * 
 * 2. data type 역할
 * 
*3.static 필드와 메소드를 포함하는 역할
*/
public class Car {
	//데이터 저장소(필드)
	public String name;
	public int price;
	public char ch;
	
	//기능(메소드)
	public void drive() {
		//this는 바로 이객체의 참조값을 가리키는 예약어이다
		System.out.println(this.name+"이(가)달려요! 가격은 "+this.price+"원!");
	}
}

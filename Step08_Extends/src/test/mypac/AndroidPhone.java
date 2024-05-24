package test.mypac;

public class AndroidPhone extends HandPhone{
	public AndroidPhone() {
		System.out.println("androidphone call");
	}
	public void doInternet() {
		System.out.println("do internet");
	}
	@Override
	public void takePicture() {
		/*
		 * 자식에서 부모쪽을 가리키는 예약어가 super이다
		 * 따라서 super.takePicture()는 부모객체의 takePicture() 를 호출하는 것이다	
		 * 오바라이드한 메소드에서 부모쪽의 원래 메소드를 호출할지 말지는 상황에 따라 다르다
		 * 오버라이드 했지만 부모의 메소드도 호출을 해주어야 메소드가 정상동작을 하는 경우도 있다
		 * 이 예제에서는 부모객체의 메소드를 호출할 필요는 없다
		 */
		//super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
}

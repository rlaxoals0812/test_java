package test.auto;

public class SportsCar extends Car{
	public SportsCar(Engine engine) {
		super(engine);//super <- 부모생성자
	}
	public void openDrive() {
		
		//부모객체읲 필드도 this.해서 참조 가능
		if(this.engine==null) {
			System.out.println("no engine");
			return;
		}
		System.out.println("뚜껑 덮고 달려");
	}
}

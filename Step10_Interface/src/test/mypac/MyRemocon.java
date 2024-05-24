package test.mypac;

public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("upload channel");
	}

	@Override
	public void down() {
		System.out.println("download channel zz");
	}
	
}

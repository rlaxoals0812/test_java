package test.main;
/*
 * RunTionException 을 상속받지 않은 Exception type 은
 * 반드시 try~ catch 블럭으로 예외처리 필요
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method start");
		try{
			//스레드 일정시간 지연(mili second)단위
			Thread.sleep(1000*10);
		}catch (InterruptedException e) {//RuntimeException 을 상속받지 않은 Exception
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}

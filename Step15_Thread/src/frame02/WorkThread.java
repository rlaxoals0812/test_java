//package frame02;
//
//import javax.swing.JOptionPane;
//
//import frame03.MyFrame;
//
///*
// * 새로운 스레드 만든느 법
// * 
// * 스레드 클래스를 상속받은 클래스를 정의하낟
// * run() 런 메소드를 오버라이드한다
// * run() 메소드 안에서 새로운 스레드에서 해야 할 작업을 코딩한다
// * 만든 클래스로 객체를 생성하고 해당 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다
// */
//public class WorkThread extends Thread{
//	public void run() {
//		System.out.println("10초 걸리는 작업 시작");
//		try {
//			Thread.sleep(1000*10);
//		}catch(InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		WorkThread a = this;
//		MyFrame b = MyFrame.this;
//		JOptionPane.showMessageDialog(MyFrame.this,"end");
//	}
//}

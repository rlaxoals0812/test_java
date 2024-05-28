////package frame01;
////
////import java.awt.FlowLayout;
////
////import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class MyFrame extends JFrame{
//	public MyFrame(String title) {
//		super(title);
//		setLayout(new FlowLayout(FlowLayout.CENTER));
//		/*
//		 * 타입 추론이 가능하다면 지역변수의 타입 선언 대신에 var로 선언 할 수 있다
//		 * 자바10에서 추가된 문법, 아ㅣㄱ도 실무에서는 1.8버전을 쓰는 곳이 많기 때문에 주의
//		 * 지역변수만 사용가능,필드 x
//		 * 인터페이스 타입 추론 불가
//		 * null로 초기화 불가
//		 */
//		var startBtn = new JButton("작업시작");
//		add(startBtn);
//		startBtn.addActionListener((e)->{
//			System.out.println("10초 걸리는 작업 시작");
//			try {
//				Thread.sleep(1000*10);
//			}catch(InterruptedException e1) {
//				e1.printStackTrace();
//			}
//			System.out.println("end");
//		});
//		var startBtn2 = new JButton("작업시작");
//		add(startBtn2);
//		startBtn2.addActionListener((e)->{
//			WorkThread t = new WorkThread();
//			t.start();
//		});
//	}
//	
//	public static void main(String[] args) {
//		MyFrame f =new MyFrame("스레드 테스트 프레임");
//		f.setBounds(100,100,300,300);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
//	}
//}

package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다
public class MyFrame extends JFrame{
	//생성자
	public MyFrame() {
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x,y,width,height);
		this.setBounds(100,100,500,500);
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);//전체화면
		//종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//타이틀 바 없애기
//		this.setUndecorated(true);         
//        this.setSize(300,300);
		
		//레이아웃 메니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		//프레임의 레이아웃 메니저 설정
		setLayout(layout);
		//버튼객체 생성
		JButton btn1 = new JButton("버튼1");
		//프레임의 add() 메소드 호출하면서 버튼 객체의 참조값을 전달하면 츠레임에 버튼이 배치된다
		this.add(btn1);
		JButton btn2 = new JButton("버튼2");
		this.add(btn2);
		JButton btn3 = new JButton("버튼3");
		this.add(btn3);
		
		//화면상에 실제 보이도록 한다
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
		
	}
}

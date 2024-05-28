package frame01;

import javax.swing.JFrame;

//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다
public class MyFrame extends JFrame{
	//생성자
	public MyFrame() {
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x,y,width,height);
//		this.setBounds(100,100,500,500);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);//전체화면
		//종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//타이틀 바 없애기
//		this.setUndecorated(true);         
//        this.setSize(300,300);
		//화면상에 실제 보이도록 한다
		this.setVisible(true);
	}
	
}

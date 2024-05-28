package frame09;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		//부모생성자
		super(title);
		//프레임의 레이아웃을 보더레이아웃으로 설정
//		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("File");
		//메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		//메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		//메뉴을 메뉴바에 추가
		mb.add(menu);
		//프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		JTextArea ta =new JTextArea();
		//프레임의 가운데에 JTestArea 배치하기
		add(ta,BorderLayout.CENTER);
		ta.setVisible(false);
		newItem.addActionListener((e)->{
			ta.setVisible(true);
		});
		JButton btn = new JButton("click");
		add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener((e)->{
			System.out.println("working");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		});
	}
}

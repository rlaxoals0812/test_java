package frame09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class MyFrame extends JFrame{	
	//필요한 필드 선언
	File openedFile;  //현재 열린 파일의 참조값을 저장할 필드 
	JTextArea ta;
	
	//생성자
	public MyFrame(String title) {
		//부모 생성자
		super(title);
		//프레임의 레이아웃을 BorderLayout 으로 설정 
		setLayout(new BorderLayout());
		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴
		JMenu menu=new JMenu("File");
		//메뉴 아이템
		JMenuItem newItem=new JMenuItem("New");
		JMenuItem openItem=new JMenuItem("Open");
		JMenuItem saveItem=new JMenuItem("Save");
		JMenuItem saveAsItem=new JMenuItem("Save As");
		//메뉴에 메뉴 아이템을 순서대로 추가 
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		//메뉴를 메뉴바에 추가 
		mb.add(menu);
		//프레임의 메소드를 이용해서 메뉴바를 추가하기 
		setJMenuBar(mb);
		
		//JTextArea 객체의 참조값을 필드에 저장 
		ta=new JTextArea();
		JScrollPane scp = new JScrollPane(ta);
		//프레임의 가운데에 JTextArea 배치하기
		add(scp, BorderLayout.CENTER);
		ta.setVisible(false);
		Font font = new Font("Consolas", Font.PLAIN,20);
		ta.setFont(font);
		// 메뉴 아이템에 액션 리스너 등록 
		newItem.addActionListener((e)->{
			ta.setVisible(true);
			setTitle("제목 없음");
		});
		
		//Save As 를 눌렀을때 실행할 리스너 등록 
		saveAsItem.addActionListener((e)->{
			//파일 선택을 도와주는 객체 생성 
			var fc=new JFileChooser("C:/Users/user/playground/myFolder");
			int result=fc.showSaveDialog(this);
			//만일 제대로 파일을 만들 준비를 했다면
			if(result == JFileChooser.APPROVE_OPTION) {
				//선택된 File 객체의 참조값을 필드에 저장 
				openedFile=fc.getSelectedFile();
				setTitle(openedFile.getName());
				//새로운 파일을 실제로 만들기
				try {
					openedFile.createNewFile();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				saveToFile();
			}
		});
		openItem.addActionListener((e)->{
			
			var fc = new JFileChooser("c:/Users/user/playground");
			int result = fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				
				openedFile = fc.getSelectedFile();
				
				String fileName = openedFile.getName();
				
				setTitle(fileName); 
				
				ta.setVisible(true);
				loadFromFile();
			}
		});
		
	}//생성자 
	public void loadFromFile() {
		String content = ta.getText();
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr =new FileReader(openedFile);
			
			br = new BufferedReader(fr);
			while(true) {
				String line=br.readLine();
				if(line == null)break;
				ta.append(line);
				ta.append("\r\n");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (Exception e) {}
		}
		
	}
	//현재까지 JTextArea 에 입력한 문자열을 읽어와서 File 에 저장하기 
	public void saveToFile() {
		//입력한 문자열 읽어오기
		String content=ta.getText();
		
		FileWriter fw=null;
		try {
			//선택한 File 객체의 참조값을 생성자에 넘겨주면서 FileWriter 객체 생성하기 
			fw = new FileWriter(openedFile);
			fw.write(content);
			fw.flush();
			
			JOptionPane.showMessageDialog(this, "저장 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		
		 MyFrame f=new MyFrame("나의 프레임");
		 
		 f.setBounds(100, 100, 500, 500);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setVisible(true);
	}
}

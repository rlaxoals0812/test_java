package frame09;

import javax.swing.JFrame;

public class MainClass01 extends JFrame{
	public static void main(String[] args) {
		MyFrame f = new MyFrame("my frame");
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

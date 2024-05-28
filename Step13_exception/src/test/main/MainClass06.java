package test.main;

import java.io.File;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main method \'start\'");
		//파일에 관련된 작업을 할 수 있는 file 객체 생성
		//파일구분자를 / 로 작성해도 알아서 처리됨
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		
		try {
			if(f.exists() == false) {
				f.createNewFile();
				System.out.println("만듬");
			}
			else if(f.exists() == true) {
				f.delete();
				System.out.println("지움");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main \\method\\ end");
	}
}


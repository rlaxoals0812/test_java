package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass11 {
	public static void main(String[] args) {
		try {
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			while(true) {
				int readedByte = fis.read();
				System.out.println(readedByte);
				if(readedByte == -1)break;
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 카피함");
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

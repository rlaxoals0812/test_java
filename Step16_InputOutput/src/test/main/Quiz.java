package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Quiz {
	public static void main(String[] args) {
		System.out.println("main method \'start\'");
		
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		InputStream kbd = System.in;
		var isr = new InputStreamReader(kbd);
		var br = new BufferedReader(isr);
		System.out.println("입력:");
		
		try {
			if(!f.exists()) {
				String line = br.readLine();
				f.createNewFile();
				System.out.println("만듬");
				FileWriter fw =new FileWriter(f);
				fw.write(line);
				fw.flush();
			}
			else if(f.exists() == true) {
				f.delete();
				System.out.println("지움");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}

package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass08 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			br.read();
			while(true) {
				int code = fr.read();
				if(code==1) {
					break;
				}
				char ch = (char)code;
				System.out.println(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			br.read();
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
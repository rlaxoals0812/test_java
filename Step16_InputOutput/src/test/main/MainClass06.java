package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * 입출력
 * 
 * 어떤 대상으로부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다
 * 프로그래밍 언어의 관점에서 메모리라는 것은 변수,필드,객체로 생각하면 편하다
 * 데이터는 2진수로 이루어져 있지만 2진수 8개의 묶음인 1byte단위로 생각하면 편하다
 * 1바이트는 총256가지의 값을 표현할 수 있다
 * 1바이트를 10진수로 환산하면 0~255사이의 숫자중에 하나이다
 * 입력과 출력을 통해서 이동하는 데이터는 바이트 하나하나가 이동한다고 생각하면 된다
 */
public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//또한 한글처리 불가
		
		var osw =new OutputStreamWriter(os);
		var bw = new BufferedWriter(osw);
		/*
		 * window의 개행	ㅇ기호 : \r\n
		 * linux, mac, os의 개행기호 :\n
		 */
		
		try {
			bw.write("하나");
			bw.newLine();
			bw.write("둘");
			bw.newLine();
			bw.write("셋");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("method start");
		//키보드와연결된 인풋스트림 타입의 참조값을 kbd라는 지역변수에 담음
		//객체는 1바이트 단위 처리 스트림임
		//영문자 대소문자 숫자 특수문자만 처리 가능
		//한글 처리 안됨
		InputStream kbd = System.in;
		//2바이트 처리 스트림(65536가지를 표현 가능)
		//한글 처리 가능
		var isr = new InputStreamReader(kbd);
		var br = new BufferedReader(isr);
		System.out.println("입력:");
		try {
			String line = br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

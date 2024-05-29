package test.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto(1, "gq", "asd");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("C:Users/user/playground/myFolder/member.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dto);
			System.out.println("파일에 객체를 저잘함");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null)oos.close();
				if(fos != null)fos.close();
			}catch (Exception e) {
				
			}
		}
	}
}

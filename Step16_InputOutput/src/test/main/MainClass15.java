package test.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:/Users/user/playground/myFolder/member.dat");
			ois = new ObjectInputStream(fis);
			MemberDto dto = (MemberDto)ois.readObject();
			String info = String.format("번호;%d, 이름:%s, 주소:$d",
					dto.getNum(),dto.getName(),dto.getAddr());
			System.out.println(info);
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null)ois.close();
				if(fis != null)fis.close();
			}catch (Exception e) {
			}
		}
	}
}

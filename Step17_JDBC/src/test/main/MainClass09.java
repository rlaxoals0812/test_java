package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		MemberDao dao=new MemberDao();
		List<MemberDto> list = dao.getList();
		
		for(MemberDto tmp:list) {
			String info = String.format("번호:%d, 이름:%s, 주소:%d",
					tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
	}
 }

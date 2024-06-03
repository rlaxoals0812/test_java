package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dao.MemberDao;
import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass08 {
	public static void main(String[] args) {
		int num=4;
		MemberDao dao = new MemberDao();
		dao.delete(num);
		MemberDto dto = new MemberDto();
		dto.setName("batman");
		dto.setAddr("hollywood");
		dao.insert(dto);
		MemberDto dto2 = new MemberDto(1,"acorn","강남");
		dao.update(dto2);
		
	}
}

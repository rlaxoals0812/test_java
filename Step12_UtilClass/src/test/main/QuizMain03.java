package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.PostDto;

public class QuizMain03 {
	public static void main(String[] args) {
		 List<PostDto> book = new ArrayList<>(); 
		 
		 PostDto m1 = new PostDto();
		 m1.setNum(1);
		 m1.setName("a");
		 m1.setTheme("고전문학");
		 
		 PostDto m2 = new PostDto(2,"b","고려가요");
		 PostDto m3 = new PostDto(3,"c","비문학");
		 
		 book.add(m1);
		 book.add(m2);
		 book.add(m3);
		 
		
		 for(PostDto tmp:book) {
			 String info = String.format
					 ("번호:%d 이름:%s 제목:%s",tmp.getNum(), tmp.getName(), tmp.getTheme());
			 System.out.println(info);
		 }
	}
}

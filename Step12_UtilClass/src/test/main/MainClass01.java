package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//java 에서 배열은 용도가 한정되어 있다.  item 을 담을수 있는 공간을 늘이거나 줄일수 없다.
		
		//문자열(String) type 을 담을수 있는 방 5개 짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		//String type 을 순서대로 저장할수 있는 ArrayList 객체 생성하고 참조값을 friends 에 담기
		ArrayList<String> friends = new ArrayList<>();
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		//0 번방의 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item=friends.get(0);
		//1 번방의 아이템을 삭제 하려면?
		friends.remove(1);
		//0 번방에  "에이콘" 을 넣고(끼워넣기) 싶으면?
		friends.add(0, "에이콘");
		//저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담아 보세요.
		int size=friends.size();
		//저장된 모든 아이템 전체 삭제
		friends.clear();
		
	}
}
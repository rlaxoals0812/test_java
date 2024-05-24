package test.mypac;

public class Member {
	public int num;
	public String name;		
	public String addr;
	
	public void showInfo() {
		String info ="번호는 "+ this.num+" 이고 이름은 "+this.name+" 이고 주소는 "+this.addr+
		"입니다.";
		System.out.println(info);
	}
	
}
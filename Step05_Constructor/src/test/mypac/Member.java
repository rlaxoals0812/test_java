package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	public Member() {}
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	public void printinfo() {
		System.out.println("number:"+this.num+" name: "+name+" address: "+addr);
	}
}

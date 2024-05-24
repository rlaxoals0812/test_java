package test.mypac;

public class PostDto {
	private int num;
	private String name;
	private String theme;
	
	public PostDto() {}
	public PostDto(int num, String name, String theme) {
		super();
		this.num = num;
		this.name = name;
		this.theme = theme;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
}

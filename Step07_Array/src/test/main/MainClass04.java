package test.main;

public class MainClass04 {
	public static void main(String[] args) {
//		String[] names = {null,null,null};
		String[]names = new String[3];
		names[0]="asd1";
		names[1]="asd2";
		names[2]="asd3";
//		String[] names2 = {"asd1","asd2","asd3"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

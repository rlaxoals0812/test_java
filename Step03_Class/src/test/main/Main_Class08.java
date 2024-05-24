package test.main;

import test.mypac.Square;

public class Main_Class08 {
 public static void main(String[] args) {
	Square s1=new Square();
	Square s2=new Square();
	
	s1.width=10;
	s1.height=10;
	
	s2.width=20;
	s2.height=20;
	
	s1.showArea();
	s2.showArea();
}
}

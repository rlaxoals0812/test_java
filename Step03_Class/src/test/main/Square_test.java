package test.main;

import test.mypac.Square;

public class Square_test {
	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square();
		
		square1.width = 30;
		square1.height = 40;
		square1.showArea();
		
		square2.width = 50;
		square2.height = 40;
		square2.showArea();
	}
}

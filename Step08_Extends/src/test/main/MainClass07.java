package test.main;

import java.util.Scanner;

import test.mypac.Phone;

public class MainClass07 {
	public static void main(String[] args) {
		Object a=10;
		Object b = true;
		Object c='a';
		
		Object d="abcd";
		Object e = new Phone();
		Object f = new Scanner(System.in);
		
		Object[] objs = new Object[5];
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		
		Phone E = (Phone)e;
		E.call();
		
		Phone Objs = (Phone)objs[3];
		Objs.call();
	}
}

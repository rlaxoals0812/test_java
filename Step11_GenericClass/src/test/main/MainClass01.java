package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	//Generic 클래스를 Apple로 지정해서 객체 사용하기
	FruitBox<Apple> box = new FruitBox<Apple>();
	
	
	Apple a1 = box.unPack();
	//Generic 클래스를 Melon로 지정해서 객체 사용
	FruitBox<Melon> box2 = new FruitBox<Melon>();
	Melon m1 = box2.unPack();
	
	FruitBox<Orange> box3 = new FruitBox<Orange>();
	Orange o1 = box3.unPack();
	
}
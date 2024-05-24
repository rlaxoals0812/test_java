package test.mypac;
@FunctionalInterface //추상 메소드를 1개만 만들도록 강제하는 역할 ( ()->{}형태로 사요할 수 있도록 보장)
public interface Calc {
	public double execute(double num1, double num2);
}

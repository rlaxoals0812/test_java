package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=true;
		
		String result = isWait ? "wait" : "no wait";
		System.out.println(result);
		
		String result2=null;
		if(isWait) {
			result2="wait";
		}else {
			result2="no wait";
		}
		System.out.println(result2);
	}
}

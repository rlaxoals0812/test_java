package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		int num=0;
		while(true) {
			try {
				Thread.sleep(1000);
				if(num == 10) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num++;
			System.out.println(num+"초");
		}
	}
}

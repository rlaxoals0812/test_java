package test.main;

public class QuizMain {
	public static void main(String[] args) {
		int num=0;
		int min = 0;
		int hour = 0;
		while(true) {
			try {
				num++;
				Thread.sleep(1);
				if(num == 60) {
					num = 0;
					min++;
				
				}
				else if(min == 59){
					min = 0;
					hour++;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(hour+"시간 "+min+"분 "+num+"초");
		}
	}
}

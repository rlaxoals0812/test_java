package test.main;

import java.util.Random;

import test.mypac.wowException;

public class MainClass08 {
    public static void main(String[] args) {
        try {
            Random ran = new Random();

            int ranNum = ran.nextInt(10);

            if(ranNum == 7) {
                //여기서 발생하는 Exception은 JVM이 직접 처리
                System.out.println("awesome");
//                throw new wowException("awesome");
            }
            else{
            	System.out.println(ranNum+" 나옴");
            }
        }catch(test.mypac.wowException we) {
            we.printStackTrace();
        }
    }
}

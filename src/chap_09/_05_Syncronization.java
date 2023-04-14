package chap_09;

import chap_09.clean.Room;

public class _05_Syncronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleaner1 =new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 ㄱ 러너블");
                for (int i = 1; i <=5; i++){
                    room.clean("직원 1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(i ==2 ){
                        throw new RuntimeException("못해먹겠노!");
                    }
                }
                System.out.println("직원1 청소 끝");
            }
        };
        //람다식으로 러너블 구현 가능
        Runnable cleaner2 =() ->{
            System.out.println("직원2 청소 ㄱ 러너블");
            for (int i = 1; i <=5; i++){
                room.clean("직원 2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("직원2 청소 끝");
        };

        Thread ct1 = new Thread(cleaner1);
        Thread ct2 = new Thread(cleaner2);
        ct1.start();
        ct2.start();
    }
}

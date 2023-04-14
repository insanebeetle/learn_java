package chap_09;

import chap_09.clean.CleanRunnable;

public class _03_join {
    public static void main(String[] args) {
        //스레드의 작업순서 조절은 슬립과 조인으로 조정(시간)

        CleanRunnable cr = new CleanRunnable();
        Thread tr = new Thread(cr);
        tr.start();
        //join()메소드는 앞의 작업이 끝날때 까지 뒤의 작업을 대기시킴
        try {
            tr.join(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        cleanbyBoss();
    }
    public static void cleanbyBoss(){
        System.out.println("사장 청소 ㄱ");
        for (int i = 1; i <=10; i+=2){
            System.out.println("(사장)" + i +"청소중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }//지정해둔 시간 동안 멈춤
        }
        System.out.println("사장청소 끝");
    }
}

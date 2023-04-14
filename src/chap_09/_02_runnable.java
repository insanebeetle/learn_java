package chap_09;

import chap_09.clean.CleanRunnable;

public class _02_runnable {
    public static void main(String[] args) {
        //01의 쓰레드를 상속하는 방식으로는 상속이 쓰레드 1개밖에 안됨
        //그러나 러너블은 인터페이스라서 다중상속 가능

        //01과느 다른 방식의 스레드 사용방식
        CleanRunnable cr = new CleanRunnable();
        Thread th = new Thread(cr);
        th.start();
        cleanbyBoss();
        //매소드 객체 생성 후 스레드 객체에 넣기 그후 start()로 실행
    }
    public static void cleanbyBoss(){
        System.out.println("사장 청소 ㄱ");
        for (int i = 1; i <=10; i+=2){
            System.out.println("(사장)" + i +"청소중");
        }
        System.out.println("사장청소 끝");
    }
}

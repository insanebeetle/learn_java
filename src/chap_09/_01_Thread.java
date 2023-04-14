package chap_09;

import chap_09.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //cleanbyself();
        CleanThread cleanThread = new CleanThread();
        //cleanThread.run();
        //run으로 시작하면 따로 작동함 그러므로
        cleanThread.start();
        cleanbyBoss();

    }

    public static void cleanbyself(){
        System.out.println("혼자 청소 ㄱ");
        for (int i = 1; i <=10; i++){
            System.out.println("(혼자)" + i +"청소중");
        }
    }
    public static void cleanbyBoss(){
        System.out.println("사장 청소 ㄱ");
        for (int i = 1; i <=10; i+=2){
            System.out.println("(사장)" + i +"청소중");
        }
        System.out.println("사장청소 끝");
    }
}

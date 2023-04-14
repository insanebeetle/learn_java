package chap_09.clean;

public class CleanThread extends Thread{
    public void run(){
        System.out.println("직원 청소 ㄱ 쓰레드");
        for (int i = 2; i <=10; i+=2){
            System.out.println("(직원)" + i +"청소중 러너블");
        }
        System.out.println("직원 청소 끝");
    }
}

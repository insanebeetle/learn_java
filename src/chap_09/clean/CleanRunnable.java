package chap_09.clean;

public class CleanRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("직원 청소 ㄱ 러너블");
        for (int i = 2; i <=10; i+=2){
            System.out.println("(직원)" + i +"청소중 러너블");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }//지정해둔 시간 동안 멈춤
        }
        System.out.println("직원 청소 끝");
    }
}

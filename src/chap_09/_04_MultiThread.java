package chap_09;

public class _04_MultiThread {
    public static void main(String[] args) {
        //다중 쓰레드
        //# 쓰레드 구현할때는 런 메소드안에 실행할 작업을 넣어주고
        //틀을 만들어서 start()호출
        Runnable cleaner1 =new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 ㄱ 러너블");
                for (int i = 1; i <=10; i+=2){
                    System.out.println("(직원1)" + i +"청소중 러너블");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }//지정해둔 시간 동안 멈춤
                }
                System.out.println("직원1 청소 끝");
            }
        };
        //람다식으로 러너블 구현 가능
        Runnable cleaner2 =() ->{
            System.out.println("직원2 청소 ㄱ 러너블");
            for (int i = 2; i <=10; i+=2){
                System.out.println("(직원2)" + i +"청소중 러너블");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }//지정해둔 시간 동안 멈춤
            }
            System.out.println("직원2 청소 끝");
        };

        Thread ct1 = new Thread(cleaner1);
        Thread ct2 = new Thread(cleaner2);
        ct1.start();
        ct2.start();

    }
}

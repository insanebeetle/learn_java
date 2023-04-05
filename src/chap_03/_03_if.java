package chap_03;

public class _03_if {
    public static void main(String[] args) {
        String greeting = "안녕하세요";
        String store = "코나";
        int customer = 10;
        
        for (int i=0; i<10; i++){
            System.out.println(greeting + " " + store +"입니다" + i);
        }

        for (int i = 0; i < 10; i +=2 ) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i=0; i<=10; i++){
            sum += i;
            System.out.println(sum);
        }

        int distance = 25;
        int move = 0; //현재이동거리
        while (move < distance){
            System.out.println("이동거리" +move) ;
            move += 3;

        }
        System.out.println("도우착!");

        distance = 25;
        move = 0; //현재이동거리
        int height = 2;
        while(move + height <distance){
            System.out.println("이동거리" +move) ;
            move += 3;

        }
        System.out.println("도우착!");

        //일단 한번은 실행 되도록 하는 반복문
        move = 0; //현재이동거리
        do{
            System.out.println("이동거리" +move) ;
            move += 3;
        } while(move + 25 <distance);
        System.out.println("도우착!");

    }
}

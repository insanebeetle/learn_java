package chap_05;

import java.util.Random;

public class _03_package {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble());//0.0이상 1.0미만 실수값
        //로또번호
        System.out.println(random.nextInt(45)+1);


        //실수 범위정하기
        double min = 5.0;
        double max = 10.0;
        System.out.println((min +(max-min) * random.nextDouble()));

    }
}

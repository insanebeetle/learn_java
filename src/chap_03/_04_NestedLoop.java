package chap_03;

public class _04_NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i  < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.println(i+" X "+ j + " = " + (i*j) );

            }

        }
        //break 문
        int a = 10;
        for (int i = 1; i < 20; i++) {
            System.out.println(i +"번째");
            if (i == a){
                System.out.println("끝!");
                break;
            }
        }

        int max = 10; //최대판매수량
        int sold = 0; //현재판매수량
        int noShow = 7;
        for (int i = 1; i < 20 ; i++) {
            System.out.println(i+"번째");

            if(i == noShow){
                System.out.println(i+"번 없음");
                continue; //이 구문 이후는 실행되지 않고 반복문 처음으로 돌아감
            }

            sold++; //판매처리
            if(sold==max){
                System.out.println("끝");
                break;
            }
        }
        System.out.println("반복문 종료");

        int price = 0;
        int hour = 5;
        boolean isSmallcar = false;
        boolean withDisabledCar = false;
        for (int i = 0; i < hour; i++) {
            price = 4000;
            if(price>30000){
                price = 30000;
                System.out.println("최대 금액입니다");
            }
        }
        if(!isSmallcar){
            System.out.println(price);
        }else {
            System.out.println(price/2);
        }

    }
}

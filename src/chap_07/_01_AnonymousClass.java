package chap_07;

public class _01_AnonymousClass {
    public static void main(String[] args) {
        //익명 클래스
        Coffee c1 =new Coffee();
        c1.order("라떼");
        Coffee c2 = new Coffee();
        c2.order("아아메");
        c1.returnTray();
        Coffee spC = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("서비스 추가 ㅎㅎ");
            }

            @Override
            public void returnTray() {
                System.out.println("s내가 치웁니다");
            }
        }; //이 객체에 한해서 특수한 메소드 등을 추가할 수 있음
        spC.order("홍차");
        spC.returnTray();
    }
}

class Coffee{
    public void order(String coffee){
        System.out.println(coffee + "나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 반납이 되었습니다.");
    }
}
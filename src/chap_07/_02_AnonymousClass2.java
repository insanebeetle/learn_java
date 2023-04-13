package chap_07;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMade = getMomMade();
        momMade.cook();

        HomeMadeBurger broMade = getBroMade();
        broMade.cook();
        //클래스 상속을 통해 인스턴스객체의 특징을 정하지 않고
        //각각의 객체를 생성하면서 그때그때 특징을 부여할수 잇음
    }

    private static HomeMadeBurger getBroMade() {
        return  new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생 수제버거");
            }
        };
    }

    public static HomeMadeBurger getMomMade(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마 수제버거");
            //이렇게 따로 메소드로 만든 이유는 한곳에 몰아넣으면 보기 힘들수 있어서
                //이런 방법도 있다라는 식의 예시
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();

}
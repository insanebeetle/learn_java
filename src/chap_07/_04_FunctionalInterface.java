package chap_07;

import chap_07.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWconverter converter = new KRWconverter();
        //converter.convert(130);
        //convertUSD((usd) -> System.out.println(usd +"달러 : " +(usd*1400)+"원"  ), 2);
        //람다식은 한 클래스에 메소드를 몰아넣을때 약식으로 만들때 사용
        Convertible convertible = (usd) -> System.out.println(usd +"달러 : " +(usd*1400)+"원"  );
        //클래스 클래스명 = (파라메타) -> 메소드
        //이를 함수형 클래스라고 하는데 인터페이스에 하나의 메소드가 존재해야함
        convertUSD(convertible, 2);

        //전달값이 없다면?
        ConvertibleWithNoParams c1 =()-> System.out.println("1달러 : 1400원");
        c1.convert();

        //두줄이상의 코드가 필요할때
        ConvertibleWithTwoParams c2 = (usd, krw)->{
            System.out.println(usd +"달러 : " + krw*usd +"원" );
        };
        c2.convert(3, 1400);

        //반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w)->{ return d*w;};
        c3.convert(10,1400);
    }

    public static  void convertUSD(Convertible converter, int usd){
        //convertible의 추상?메소드가 위의 람다식과 같은 성격을 띄는걸 감지해서 문제없음
        converter.convert(usd);
    }
}

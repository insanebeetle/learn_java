package chap_06;

public class _03_Wapperclass {
    public static void main(String[] args) {
        //래퍼 클래스 - 기본자료형을 객체로 만들어줌
        //int - integer , double- Double, float-Float, char

        Integer i = 123;
        Double d = 1.0;
        Character c = 'a';
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        String s = i.toString();
        System.out.println(s);
    }
}

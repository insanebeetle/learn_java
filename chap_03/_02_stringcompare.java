package chap_03;

public class _02_stringcompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase("python"));
        //대소문자 구분없이 문자열 비교

        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //내용비교
        System.out.println(s1 == s2);  //참고 비교
        //위의 1234는 메모리에 저장되고 s1,s2는 같은곳을 바라보는 참조값


        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //내용은 같으나
        System.out.println(s1 == s2); //참조는 다름
        //new String은 객체생성이므로 서로 다른곳을 바라보는 병개의 것
        //결론 : 문자열 비교할때는 equal()을 사용할것!

        System.out.println("\"자바\"가\n너무\t꿀잼\\ㅅㅂ");

        String num = "910417-11192222";
        System.out.println(num.substring(0,8));
        System.out.println(num.substring(0,num.indexOf("-")+2));

    }
}
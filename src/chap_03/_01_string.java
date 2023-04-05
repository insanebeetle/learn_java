package chap_03;

public class _01_string {
    public static void main(String[] args) {
        String s = "i love java.";
        System.out.println(s.length());

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //포함관계
        System.out.println(s.contains("java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("java"));
        System.out.println(s.indexOf("C#")); //불일치시 -1
        System.out.println(s.lastIndexOf("love")); //뒤쪽에서 찾기
        System.out.println(s.startsWith("i")); // 이 단어로 시작하니?
        System.out.println(s.endsWith("va.")); // 이 단어로 끝나니?

        //문자열 반환
        System.out.println(s.replace("love","like"));//첫인자 문자열을 두번째 문자열로 교체
        System.out.println(s.substring(s.indexOf("love")));
        System.out.println(s.substring(s.indexOf("love"), s.indexOf(".")));
        //첫 인자부터 포함하지만 인자2는 포함시키지 않음

        //공백제거
        String s2 = "    I LOVE JAVA   ";
        System.out.println(s2.trim());

        //문자열 결합
        String s3 = "love";
        String s4 = "Peace";
        System.out.println(s3+s4);
        System.out.println(s3.concat(",").concat(s4)); //다른 방식의 결합
    }
}

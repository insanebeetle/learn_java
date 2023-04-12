package chap_06;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //set은 중복허용 X 순서도 제멋대로임 
        HashSet<String> set =new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("콜라");
        set.add("후추");
        set.add("삼겹살");
        set.add("상추");
        set.add("상추");
        set.add("소금");

        //내용확인 + 
        System.out.println(set.size());
        for (String s: set
             ) {
            System.out.println(s);
        }
        System.out.println("-------------");
        System.out.println(set.contains("삼겹살"));
        System.out.println("-------------");
        System.out.println(set.size());
        set.remove("깻잎"); //없는데이터는 그냥 무시(에러X)
        System.out.println(set.size());
        System.out.println("-------------");
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println("-------------");

        //순서가 있는 set을 쓰고 싶다면
        HashSet<String> set2 =new LinkedHashSet<>();

    }
}

package chap_06;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //어레이 리스트는 데이터 수정시 자동정렬됨
        //링크드 리스트
        LinkedList<String> list =new LinkedList<>();
        list.add("유재호");
        list.add("유민하");
        list.add("김인경");
        list.add("손연경");
        list.add("김지훈");
        //첫번째, 마지막놈 출력
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.addFirst("미사토"); //첫번째로 넣기
        list.addLast("쿠라");//마지막에 넣기
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("--------");
        list.add(1,"호리");
        System.out.println(list.get(1));
        System.out.println("--------");

        //삭제
        System.out.println(list.size());
        list.remove(list.size()-1);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        for (String s:list) {
            System.out.println(s);
        }

        //변경
        list.set(2, "미사토");
        System.out.println(list.get(2));
        //나머지는 Arraylist랑 같음
        System.out.println("--------");

        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }
    }

}

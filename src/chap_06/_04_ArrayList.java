package chap_06;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크 - list set map
        ArrayList<String> list = new ArrayList<>();

        //리스트명.add()로 데이터 추가
        list.add("유재호");
        list.add("유민하");
        list.add("김인경");
        list.add("손연경");
        list.add("김지훈");

        //데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        //데이터 삭제
        System.out.println(list.size()); //리스트 데이터갯수
        System.out.println(list.size()); //리스트 데이터갯수
        list.remove("유민하"); //최초의 값만 삭제
        System.out.println(list.size()); //리스트 데이터갯수
        System.out.println(list.get(3));
        System.out.println("------------");

        System.out.println("제외전 : " + list.size());
        list.remove(list.size()-1);
        System.out.println("제외전 : " + list.size());
        System.out.println("------------");
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("------------");

        //데이터 값 변경
        System.out.println(list.get(1));
        list.set(1, "마나미");
        System.out.println(list.get(1));
        System.out.println("------------");

        //index로 확인
        System.out.println(list.indexOf("손연경"));
        //리스트에 포함되어있는가?
        if(list.contains("김인경")){
            System.out.println("포함됨");
        }else {
            System.out.println("입구컷!");
        }

        //리스트 데이터 전체 삭제 clear
        list.clear();
        if(list.isEmpty()){ //isEmpty는 비어있나 참거짓문
            System.out.println(list.size() +"비어있음");
        }

        //데이터 다시 입력
        list.add("유재호");
        list.add("유민하");
        list.add("김인경");
        list.add("손연경");
        list.add("김지훈");

        //데이터 정렬
        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }
    }
}

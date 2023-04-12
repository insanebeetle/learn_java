package chap_06;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //Arraylist자체가 List(인터페이스)에서 implement받음

        list.add("유재호");
        list.add("알수없음");
        list.add("알수없음");
        list.add("김인경");
        list.add("손연경");
        list.add("알수없음");
        list.add("임새롬");

        for (String a: list) {
            System.out.println(a);
        }
        System.out.println("-------------");
        Iterator<String> it = list.iterator();
        //이코드가 실행되면 커서가 list의 객체 생성 코드쪽에 가있음
        System.out.println(it.next());
        //이 코드는 커서를 다음으로 이동
        System.out.println("-------------");
        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");
        it = list.iterator(); //커서로 초점맞추기
        while(it.hasNext()){ //모든 데이터 확인
            String s = it.next(); //각데이터 추출
            if(s.contains("알수없음")){ //일치 확인
                it.remove();        //삭제
            }
        }
        for (String a: list) {
            System.out.println(a);
        }

        HashSet<String> set = new HashSet<>();
        set.add("유재호");
        list.add("알수없음");
        set.add("김인경");
        set.add("손연경");
        list.add("알수없음");

        Iterator<String> itset = set.iterator();
        while(itset.hasNext()){
            System.out.println(itset.next());
        }
        System.out.println("-------------");
        itset = set.iterator();
        while(itset.hasNext()){
            String s = itset.next();
            if(s.contains("알수없음")){
                itset.remove();
            }
        }
        for (String a: set) {
            System.out.println(a);
        }
        System.out.println("-------------");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("유재호", 10);
        map.put("김인경", 2);
        map.put("손연경", 10);

        //맵은 iterator를 바로 사용 안됨
        Iterator<String> itMapKey = map.keySet().iterator();
        while(itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }
        Iterator<Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }
        //위 두 while문은 key, vlaue 따로 작동

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
            System.out.println(itMap.next());
            //hasnext쓰면 무한루프빠짐
        }

    }
}

package chap_06;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵 - (key, Value) 맵도 순서반영X, 키값중복X, 밸류중복ㅇ
        HashMap<String,Integer> map = new HashMap<>();
        //이것도 순서필요하면 LinkedHashMap

        //데이터추가 + 조회
        map.put("유재호", 10);
        map.put("김인경", 2);
        map.put("손연경", 10);
        System.out.println(map.size());
        System.out.println(map.get("유재호"));

        //확인
        if(map.containsKey("유재호")){
            int point = map.get("유재호");
            map.put("유재호", ++point);
            System.out.println(map.get("유재호"));
        }else {
            map.put("유재호", 1);
                System.out.println("뉴멤버할래요?");
        }
        
        map.remove("김인경");
        System.out.println(map.get("김인경"));

        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        map.put("유재호", 10);
        map.put("김인경", 2);
        map.put("손연경", 10);

        for (String key : map.keySet()){
            System.out.println(key);
        }
        //ketSet()은 키를 받아오는 메소드
        for (int value: map.values()
             ) {
            System.out.println(value);
        }
        System.out.println("------------------");
        //key, value를 동시에 확인
        for (String key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("------------------");

        map.put("유재호", 20);
        map.put("유재호", 30);
        map.put("유재호", 40);
        for (int key : map.values()){
            System.out.println(key);
        }
    }
}

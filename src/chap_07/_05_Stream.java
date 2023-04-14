package chap_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림을 만드는 여러가지 방법
//        스트림은 배열에서 일정한 필터를 사용하기 위해 사용
        int[] score = {100,95,90,85,80};
        IntStream scoreStream = Arrays.stream(score);//컨트 알트 브이

        String[] lang = {"python", "java", "c", "c#", "c++"};
        Stream<String> langStream = Arrays.stream(lang);

        //콜렉션.스트림으로 생성
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "c", "c#", "c++");
        //한번에 리스트 생성 메소드

        Stream<String> langListStream = langList.stream();
        //스트림of로 생성
        Stream<String> langListOfStream = Stream.of("python", "java", "c", "c#", "c++");

        //스트림 사용
        //중간 연산 Intermediate Operation 여러 필터링사용 : filter, map, sorted,distinct, skip...
        // 최종연산 Terminal Operation 최종 필터 연산 : count, min, max, sum, foreach...

        //90점이상 추출
        Arrays.stream(score).filter(x-> x>=90).forEach(x-> System.out.println(x));
        System.out.println("--------------");
        Arrays.stream(score).filter(x-> x>=90).forEach(System.out::println);
        //::을 이용하면 앞에서 연결해서 받는 데이터를 그대로 받아올수 있음
        System.out.println("--------------");
        //90점이상 갯수
        long count =Arrays.stream(score).filter(x->x>=90).count();
        System.out.println(count);
        System.out.println("--------------");

        //90점 이상 합
        int sum = Arrays.stream(score).filter(x->x>=90).sum();
        System.out.println(sum);
        System.out.println("--------------");

        //90점 이상인 점수들을 정렬
        Arrays.stream(score).filter(x->x>=90).sorted().forEach(System.out::println);
        System.out.println("--------------");

//        String[] lang = {"파이썬", "자바", "씨", "쓰샵", "씨쁠쁠"};
        //c로 시작하는 언어
        Arrays.stream(lang).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("--------------");

        Arrays.stream(lang).filter(x->x.contains("자바")).forEach(System.out::println);
        System.out.println("--------------");
        //Arrays.stream(lang).filter(x->x.length()<4).sorted().forEach(System.out::println);
        langList.stream().filter(x->x.length()<4).sorted().forEach(System.out::println);
        //위 주석 코드랑 같은 값
        System.out.println("--------------");
        langList.stream().
                filter(x->x.length()<4).
                filter(x->x.contains("c")).
                sorted().forEach(System.out::println);
        System.out.println("--------------");
//      4글자 이하 언어 중 C 글자를 포함하는 언어가 하나라도 있는가
        boolean anyMatch = langList.stream().
                filter(x->x.length()<=4).
                anyMatch(x->x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("--------------");
//      3글자 이하 언어 중 C 글자를 포함하는 언어가 모두 있는가
        boolean allMatch = langList.stream().
                filter(x->x.length()<=3).
                allMatch(x->x.contains("c"));
        System.out.println(allMatch);
        System.out.println("--------------");

        //4글자 이하 언어중 C포함되면 문구 추가 ㅡmap
        langList.stream().filter(x->x.length()<=4).
                filter(x->x.contains("c")).
                map(x-> x + "어렵수").
                forEach(System.out::println);
        System.out.println("--------------");

        langList.stream().filter(x->x.contains("c")).
                map(x-> x.toUpperCase()). //혹은 map(String::toUpperCase 로도 가능
                forEach(System.out::println);
        System.out.println("--------------");

        //가공된 데이터를 리스트로 저장
        List<String> langListSorted = langList.stream().filter(x -> x.contains("c")).
                map(x -> x.toUpperCase()).
                collect(Collectors.toList());
        langListSorted.stream().forEach(System.out::println);
        //스트림은 한번 가공되면 변형되기 때문에
        //스트림을 원본을 매번 호출해줘야됨
    }
}

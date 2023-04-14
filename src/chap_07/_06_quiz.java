package chap_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_quiz {
    public static void main(String[] args) {
        Customer a1 = new Customer("챈들러", 50);
        Customer a2 = new Customer("레이첼", 42);
        Customer a3 = new Customer("모니카", 21);
        Customer a4 = new Customer("벤자민", 18);
        Customer a5 = new Customer("제임스", 5);
        List<Customer> list = new ArrayList<>();
        list = Arrays.asList(a1,a2,a3,a4,a5);
//        list.stream().filter(x-> x.age>20).map(x-> x.name +" " + "5000원").forEach(System.out::println);
//        list.stream().filter(x-> x.age<20).map(x-> x.name +" " + "무료").forEach(System.out::println);
//        위는 내가 만든 답지  결과는 합격
        list.stream().map(x->x.age>=20 ? x.name + " 5000원" : x.name + " 무료").forEach(System.out::println);
        //map이 존나 만능.
        //필터 필요없이 다 걸러내고 사용 메소드 변형 이용가능
    }
}


class Customer{
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void checkFee(String n, int a){
        if(a>=20){
            System.out.println(n +"손님은 5000원입니다");
        }else{
            System.out.println(n +"손님은 미성년 무료입니다");
        }
    }
};
package chap_06;

import chap_06.Coffee.*;
import chap_06.user.User;
import chap_06.user.VipUser;

public class _02_GenericsClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("생숰킹");
        c2.ready();

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("헤으응");
        c4.ready();
        //오브젝트로 넘겨도 표현은 가능함 (모든 객체는 오브젝트로 비롯되서 가능)
        int c3Name = (int)c3.name;
        System.out.println(c3Name);

        String c4Name = (String)c4.name;
        System.out.println(c4Name);

        //c4Name = (String)c3.name; 이 코드는 컴파일에러
        //오브젝트를 형변화시키는것은 가능하지만 컴파일 오류발생가능성 있음
        //따라서 제네릭으로 어떤 파라메타가 넘어가도 작동하도록 만듦

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 =new Coffee<>("뿡뿡");
        c6.ready();
        //객체가 생성되면서 타입이 정해지기 때문에 형변환에 따른 에러 리스크 없음

        CoffeeByUser<User> c7 =new CoffeeByUser<User>(new User("강호동"));
        //coffeebyuser안에 user라는 객체가 있기때문에 객체 생성할때 user의 객체도 생성
        c7.ready();

        CoffeeByUser<User> c8 =new CoffeeByUser<>(new VipUser("유재호"));
        c8.ready();
        
        orderCoffee("김지훈");
        orderCoffee( 36);
        orderCoffee(38,"아아메");
        
    }
    
    public static <T> void orderCoffee(T name){
        System.out.println(name);
    }
    //제네릭으로 여러 변수를 전달하고 싶을땐 아래처럼
    public static <T,V> void orderCoffee(T name, V coffee){
        System.out.println(name);
        System.out.println(coffee +" 준비 완료" + name);
    }
}   

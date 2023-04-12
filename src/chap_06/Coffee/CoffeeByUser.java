package chap_06.Coffee;

import chap_06.user.User;

public class CoffeeByUser<T extends User> {
    //정해진 형태의 클래스만 받기 위한 설정
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("제네릭 타입지정 : " +user.name);
        user.addPoint();
    }
}

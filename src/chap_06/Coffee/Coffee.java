package chap_06.Coffee;

public class Coffee <T>{
    public T name;

    public Coffee(T name) {
        this.name = name;
    }
    public void ready(){
        System.out.println("제네릭 클래스 : " + name);
    }
}

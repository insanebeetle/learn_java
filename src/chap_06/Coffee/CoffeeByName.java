package chap_06.Coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println(name);
    }
}

package quiz07;

public class Burger {
    private String name = "햄버거";
    private String matetial = "기본 재료";

    public void setMatetial(String matetial) {
        this.matetial = matetial;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getMatetial() {
        return matetial;
    }

    private String getName() {
        return name;
    }
    public void cook(){
        System.out.println(getName()+"의 재료 : " + getMatetial());
    }
}

class Cheezebrger extends Burger{
    public Cheezebrger() {
        setName("CheezeBurger");
        setMatetial("치즈");
    }
    public void cook(){
        super.cook();
    }

}

class ShirimpBurger extends Burger{
    public ShirimpBurger() {
        setName("ShrimpBurger");
        setMatetial("새우");
    }
    public void cook(){
        super.cook();
    }

}
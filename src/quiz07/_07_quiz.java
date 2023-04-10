package quiz07;

public class _07_quiz {
    public static void main(String[] args) {
        Burger[] burgers = new Burger[3];
        burgers[0] = new Burger();
        burgers[1] = new Cheezebrger();
        burgers[2] = new ShirimpBurger();

        for (Burger burger: burgers) {
            burger.cook();
        }
    }
}

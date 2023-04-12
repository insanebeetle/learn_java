package chap_06.Coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready(){
        System.out.println("커피준비완료 : " +waitingNumber);

    }
}

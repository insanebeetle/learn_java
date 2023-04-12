package chap_06.Coffee;

public class CoffeeByNickname {
    public String Nickname;

    public CoffeeByNickname(String nickname) {
        Nickname = nickname;
    }
    public void ready(){
        System.out.println("커피 닉네임 " + Nickname);
    }
}

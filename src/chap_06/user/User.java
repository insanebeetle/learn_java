package chap_06.user;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void addPoint(){
        System.out.println(name + "포인트 적립");
    }
}

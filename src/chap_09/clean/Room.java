package chap_09.clean;

public class Room {
    public int number =1;
    synchronized public void clean(String name){
        System.out.println(name + " : " +number + "청소중");
        number++;
    }
    //싱크로나이즈로 받아서 접근제한 걸기
}

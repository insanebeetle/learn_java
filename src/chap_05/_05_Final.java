package chap_05;

import chap_05.Camera.ActionCam;

public class _05_Final {
    public static void main(String[] args) {
        ActionCam ac = new ActionCam();
        ac.recordVideo();
        ac.makevideo();

        //ac.lens="표준렌즈"; final선언으로 변경 불가
        //private이라해도 클래스내 변경은 가능 따라서 final로 절대고정
        ac.recordVideo();
        ac.makevideo();

        // + 메소드, 클래스도 final을 먹여서 오버라이딩을 못하게 할수 있음
        //단 final 클래스의 경우 상속이 불가능함

        Resolution resol =Resolution.HD;
        System.out.println(resol);

        resol = Resolution.UHD;
        System.out.println(resol);

        for (Resolution res : Resolution.values()){
            System.out.println(res.name()+" "+ res.ordinal());
        }
        for (Resolution res : Resolution.values()){
            System.out.println(res.name()+" "+ res.getWidth());
        }
        //name은 값 ordinal은 배열값

    }
}
//열거형 (Enum) "상수"  클래스 "밖"에다 만들것!
    enum Resolution{
    HD(1280),fHD(1920),UHD(3840);
    private final int width; //각각의 배열이 가질 값?
    Resolution(int width){
        this.width = width;
    } //생성자로 초기화
    public int getWidth(){
        return width;
    }//getter로 불러오기 private이니까

}

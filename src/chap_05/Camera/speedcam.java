package chap_05.Camera;

public class speedcam extends Camera{
    public String name;

    public speedcam() {
        //this.name = "speedCam";
        super("과속단속 카메라");
        //super.메소드명은 부모클래스의 메소드에 접근
        //super()식은 부모클래스의 생성자에 접근 이름주의..
    }

    public void takePicture(){
        super.takePicture();
        checkSpeed();
    }
    //자식클래스에서 메소드를 사용할때 동시에 사용하고 싶다면
    //위처럼 메소드형식만 가져온 다음에 super.메소드명을 이용해 호출가능

    public void checkSpeed(){
        System.out.println("속도 체크");
    }
}

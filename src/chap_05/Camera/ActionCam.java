package chap_05.Camera;

public class ActionCam extends Camera{
    public final String lens ="광각렌즈";
    public ActionCam() {
        super("액션 카메라"); //부모 생성자 받아오기
    }

    public void makevideo(){
        System.out.println(this.name +" : "+this.lens);
    }
}
